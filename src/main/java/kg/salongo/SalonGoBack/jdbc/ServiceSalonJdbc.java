package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.data.ServiceBySubCat;
import kg.salongo.SalonGoBack.entity.Category;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;

import kg.salongo.SalonGoBack.entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class ServiceSalonJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    WorkTimeJdbc workTimeJdbc;

    public List<ServiceSalon> findAll() {
        return jdbcTemplate.query("SELECT*FROM ServiceSalon",
                new BeanPropertyRowMapper<>(ServiceSalon.class));
    }

    public ServiceSalon findById(int id) {
        return jdbcTemplate.queryForObject("SELECT*FROM ServiceSalon WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(ServiceSalon.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM ServiceSalon WHERE id=?",
                new Object[]{id});

    }
    public int save(ServiceSalon sSalon) {
        return jdbcTemplate.update("INSERT INTO ServiceSalon (SalonId, SubCategoryId,Price,Description,Image) " +
                        "VALUES (?,?,?,?,?)",
                sSalon.getSalonId(),
                sSalon.getSubCategoryId(),
                sSalon.getPrice(),
                sSalon.getDescription(),
                sSalon.getImage());
    }
    public List<ServiceSalon> findBySalonId(int SalonId) {
        return jdbcTemplate.query("SELECT * FROM ServiceSalon WHERE SalonId = ?", new Object[]{SalonId},
                new BeanPropertyRowMapper<>(ServiceSalon.class));
    }

    public List<ServiceBySubCat> findBySubCategory(int SalonId) {
        List<ServiceBySubCat> resList = jdbcTemplate.query("SELECT ss.*, us.NAME, us.ADDRESS, us.PHONE,us.status  FROM ServiceSalon ss" +
                        " JOIN users us ON ss.SALONID = us.ID" +
                        " WHERE SubCategoryId = ?", new Object[]{SalonId},
                new BeanPropertyRowMapper<>(ServiceBySubCat.class));

        for (ServiceBySubCat servSubCat : resList) {
            servSubCat.setWorkTimes(workTimeJdbc.findBSalonId(servSubCat.getSalonId()));
        }



        return resList;
    }


    public List<Category> findByUserSalon(int SalonId) {
        List<Category> resList = jdbcTemplate.query("select c.* from servicesalon ss" +
                        "LEFT JOIN subcategory sc ON sc.Id = ss.SubcategoryId" +
                        "LEFT JOIN category c ON c.Id = sc.CategoryId" +
                        "WHERE ss.SalonId = ?" +
                        "group by c.Id;", new Object[]{SalonId},
                new BeanPropertyRowMapper<>(Category.class));


        return resList;
    }
    public List<SubCategory> findByCategoryId(int SalonId, int CategoryId) {
        List<SubCategory> resList = jdbcTemplate.query("select sc.* from servicesalon ss" +
                        "LEFT JOIN subcategory sc ON sc.Id = ss.SubcategoryId" +
                        "WHERE ss.SalonId = ? AND sc.CategoryId = ?" +
                        "group by sc.Id;", new Object[]{SalonId,CategoryId},
                new BeanPropertyRowMapper<>(SubCategory.class));


        return resList;
    }

    public List<ServiceSalon>findBySubCategoryId(int salonId,int subcategoryId){
        List<ServiceSalon>resList=jdbcTemplate.query(
                "SELECT * FROM servicesalon WHERE SalonId = ? AND subcategoryId = ?",
                new Object[]{salonId,subcategoryId} ,
                new BeanPropertyRowMapper<>(ServiceSalon.class));
        return resList;
    }
//    public List<MoreServiceBySubCat>findBySubCategoryId(int SalonId) {
//        List<MoreServiceBySubCat> resList = jdbcTemplate.query(" SELECT mss.*, mus.NAME, mus.ADDRESS, mus.PHONE,mus.typeStatus  FROM ServiceSalon mss\n" +
//                        "JOIN USERSALON mus ON mss.SALONID = mus.ID\n" +
//                        "WHERE SubcategoryId = ?", new Object[]{SalonId},
//                new BeanPropertyRowMapper<>(MoreServiceBySubCat.class));
//
//        for (MoreServiceBySubCat moreservSubCat : resList) {
//            moreservSubCat.setWorkTimes(workTimeJdbc.findBSalonId(moreservSubCat.getSalonId()));
//
//        }
//        return resList;
//
//
//    }



    public ServiceSalon findByToken(String token) {
        return jdbcTemplate.queryForObject("SELECT * FROM ServiceSalon WHERE token = ?", new Object[]{token},
                new BeanPropertyRowMapper<>(ServiceSalon.class));
    }

}


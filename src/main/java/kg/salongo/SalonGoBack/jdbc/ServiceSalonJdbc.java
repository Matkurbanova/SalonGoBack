package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.data.ServiceBySubCat;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;

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


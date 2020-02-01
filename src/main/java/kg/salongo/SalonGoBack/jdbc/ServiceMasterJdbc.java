package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.data.ServiceBySubCat;
import kg.salongo.SalonGoBack.data.ServiceMasterBySubCat;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceMasterJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ServiceMaster> findAll() {
        return jdbcTemplate.query("SELECT*FROM ServiceMaster",
                new BeanPropertyRowMapper<>(ServiceMaster.class));
    }

    public ServiceMaster findById(int id) {
        return jdbcTemplate.queryForObject("SELECT*FROM ServiceMaster WHERE id=?",
                new Object[]{id}, new BeanPropertyRowMapper<>(ServiceMaster.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM ServiceMaster WHERE id=?",
                new Object[]{id});

    }

    public List<ServiceMaster> findByUserMasterId(int UserMasterId) {
        return jdbcTemplate.query("SELECT * FROM ServiceMaster WHERE UserMasterId = ?", new Object[]{UserMasterId},
                new BeanPropertyRowMapper<>(ServiceMaster.class));
    }
    public List<ServiceMasterBySubCat> findBySubCategory(int UserMasterId) {
        List<ServiceMasterBySubCat> resList = jdbcTemplate.query("SELECT sm.*, um.NAME, um.PHONE, um.workExperienceYear,um.ImageMaster,um.Instagram,um.typeStatus  FROM ServiceMaster sm\n" +
                        "JOIN USERMASTER um ON sm.USERMASTERID = um.ID\n" +
                        "WHERE SubcategoryId = ?", new Object[]{UserMasterId},
                new BeanPropertyRowMapper<>(ServiceMasterBySubCat.class));



        return resList;
    }
    public ServiceMaster findByToken(String token) {
        return jdbcTemplate.queryForObject("SELECT * FROM ServiceMaster WHERE token = ?", new Object[]{token},
                new BeanPropertyRowMapper<>(ServiceMaster.class));
    }

}

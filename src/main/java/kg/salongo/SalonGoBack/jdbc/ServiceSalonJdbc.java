package kg.salongo.SalonGoBack.jdbc;

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
    public List<ServiceSalon> findAll(){
        return jdbcTemplate.query("SELECT*FROM ServiceSalon",
                new BeanPropertyRowMapper<>(ServiceSalon.class));
    }
    public ServiceSalon findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM ServiceSalon WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(ServiceSalon.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM ServiceSalon WHERE id=?",
                new Object[]{id});

    }
    public List<ServiceSalon> findBySalonId(int SalonId) {
        return jdbcTemplate.query("SELECT * FROM ServiceSalon WHERE SalonId = ?", new Object[]{SalonId},
                new BeanPropertyRowMapper<>(ServiceSalon.class));
    }
}



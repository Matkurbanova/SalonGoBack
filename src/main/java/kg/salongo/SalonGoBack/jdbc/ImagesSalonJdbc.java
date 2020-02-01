package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.ImagesSalon;
import kg.salongo.SalonGoBack.entity.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public class ImagesSalonJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ImagesSalon> findAll(){
        return jdbcTemplate.query("SELECT*FROM ImagesSalon",
                new BeanPropertyRowMapper<>(ImagesSalon.class));
    }
    public ImagesSalon findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM ImagesSalon WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(ImagesSalon.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM ImagesSalon WHERE id=?",
                new Object[]{id});


    }
    public List<ImagesSalon> findBServiceSalonId(int ServiceSalonId) {
        return  jdbcTemplate.query("SELECT*FROM ImagesSalon WHERE SERVICESALONID=?",new Object[]{ServiceSalonId},new BeanPropertyRowMapper<>
                (ImagesSalon.class));
    }
}



package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImagesJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Images> findAll(){
        return jdbcTemplate.query("SELECT*FROM Images",
                new BeanPropertyRowMapper<>(Images.class));
    }
    public Images findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM Images WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(Images.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Images WHERE id=?",
                new Object[]{id});

    }
}



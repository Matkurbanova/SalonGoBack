package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.ImagesMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImagesMasterJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ImagesMaster> findAll(){
        return jdbcTemplate.query("SELECT*FROM ImagesMaster",
                new BeanPropertyRowMapper<>(ImagesMaster.class));
    }
    public ImagesMaster findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM ImagesMaster WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(ImagesMaster.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM ImagesMaster WHERE id=?",
                new Object[]{id});

    }
}



package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Service> findAll(){
        return jdbcTemplate.query("SELECT*FROM Service",
                new BeanPropertyRowMapper<>(Service.class));
    }
    public Service findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM Service WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(Service.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Service WHERE id=?",
                new Object[]{id});

    }
}



package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TypeServiceJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<TypeService> findAll(){
        return jdbcTemplate.query("SELECT*FROM TypeService",
                new BeanPropertyRowMapper<>(TypeService.class));
    }
    public TypeService findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM TypeService WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(TypeService.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM TypeService WHERE id=?",
                new Object[]{id});

    }
}



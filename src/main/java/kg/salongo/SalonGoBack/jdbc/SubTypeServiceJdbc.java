package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.SubTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubTypeServiceJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<SubTypeService> findAll(){
        return jdbcTemplate.query("SELECT*FROM SubTypeService",
                new BeanPropertyRowMapper<>(SubTypeService.class));
    }
    public SubTypeService findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM SubTypeService WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(SubTypeService.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM SubtypeService WHERE id=?",
                new Object[]{id});

    }
}



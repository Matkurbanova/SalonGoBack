package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Category> findAll(){
        return jdbcTemplate.query("SELECT*FROM Category",
                new BeanPropertyRowMapper<>(Category.class));
    }
    public Category findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM Category WHERE id=?",new Object[]{id},
                new BeanPropertyRowMapper<>(Category.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Category WHERE id=?",
                new Object[]{id});

    }
}



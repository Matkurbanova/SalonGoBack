package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubCategoryJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<SubCategory> findAll(){
        return jdbcTemplate.query("SELECT*FROM SubCategory",
                new BeanPropertyRowMapper<>(SubCategory.class));
    }
    public SubCategory findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM SubCategory WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(SubCategory.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM SubCategory WHERE id=?",
                new Object[]{id});

    }
}



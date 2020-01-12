package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Saved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SavedJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Saved> findAll(){
        return jdbcTemplate.query("SELECT*FROM Saved",
                new BeanPropertyRowMapper<>(Saved.class));
    }
    public Saved findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM Saved WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(Saved.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Saved WHERE id=?",
                new Object[]{id});

    }
}



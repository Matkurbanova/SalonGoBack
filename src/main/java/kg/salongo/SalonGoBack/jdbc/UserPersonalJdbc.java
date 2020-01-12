package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.UserPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserPersonalJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<UserPersonal> findAll(){
        return jdbcTemplate.query("SELECT*FROM UserPersonal",
                new BeanPropertyRowMapper<>(UserPersonal.class));
    }
    public UserPersonal findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM UserPersonal WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(UserPersonal.class));
    }

    public UserPersonal findByLogin(String login) {
        return  jdbcTemplate.queryForObject("SELECT*FROM UserPersonal WHERE LOGIN=?",new Object[]{login},new BeanPropertyRowMapper<>(UserPersonal.class));
    }

    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM UserPersonal WHERE id=?",
                new Object[]{id});

    }
}



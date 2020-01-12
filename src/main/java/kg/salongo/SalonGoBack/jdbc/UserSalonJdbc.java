package kg.salongo.SalonGoBack.jdbc;
import kg.salongo.SalonGoBack.entity.UserSalon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserSalonJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<UserSalon> findAll(){
        return jdbcTemplate.query("SELECT*FROM UserSalon",
                new BeanPropertyRowMapper<>(UserSalon.class));
    }
    public UserSalon findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM UserSalon WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(UserSalon.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM UserSalon WHERE id=?",
                new Object[]{id});

    }
}



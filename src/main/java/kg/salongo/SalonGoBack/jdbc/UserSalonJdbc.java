package kg.salongo.SalonGoBack.jdbc;
import kg.salongo.SalonGoBack.entity.UserMaster;
import kg.salongo.SalonGoBack.entity.UserSalon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
    public UserSalon findByLogin(String login) {
        try {
            return jdbcTemplate.queryForObject("SELECT*FROM UserSalon WHERE LOGIN=?", new Object[]{login},
                    new BeanPropertyRowMapper<>(UserSalon.class));
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
            return null;
        }

    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM UserSalon WHERE id=?",
                new Object[]{id});

    }
    public int insert(UserSalon userSalon) {
        int resCount = jdbcTemplate.update("insert into userSalon " +
                "(login,name,password,phone,address,description,instaLogin,logoSalon) " + "values(?, ?, ?, ?, ?, ?, ?, ?)",
                userSalon.getLogin(),
                userSalon.getName(),
                userSalon.getPassword(),
                userSalon.getPhone(),
                userSalon.getAddress(),
                userSalon.getDescription(),
                userSalon.getInstaLogin(),
                userSalon.getLogoSalon());
        if (resCount > 0) {
            return jdbcTemplate.queryForObject("SELECT MAX(id) FROM userSalon", Integer.class);
        }
        return -1;
    }
    public int update(UserSalon userSalon) {
        return jdbcTemplate.update("update userSalon " + "set login = ?, name = ?, password = ?, phone =?, address = ?, description = ?, instaLogin =?,logoSalon =?,token = ?" +
                " where id = ?",
                userSalon.getLogin(),
                userSalon.getName(),
                userSalon.getPassword(),
                userSalon.getPhone(),
                userSalon.getAddress(),
                userSalon.getDescription(),
                userSalon.getInstaLogin(),
                userSalon.getLogoSalon(),
                userSalon.getToken(),
                userSalon.getId());

    }






    }



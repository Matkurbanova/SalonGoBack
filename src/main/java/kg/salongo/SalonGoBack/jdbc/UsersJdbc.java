package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT*FROM users",
                new BeanPropertyRowMapper<>(User.class));
    }

    public User findById(int id) {
        return jdbcTemplate.queryForObject("SELECT*FROM users WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(User.class));


    }

    public User findByLogin(String login) {
        try {
            return jdbcTemplate.queryForObject("SELECT*FROM users WHERE LOGIN=?", new Object[]{login},
                    new BeanPropertyRowMapper<>(User.class));
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public User findByToken(String token) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE token = ?", new Object[]{token},
                new BeanPropertyRowMapper<>(User.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM users WHERE id=?",
                new Object[]{id});

    }

    public int insert(User userMaster) {
        int resCount = jdbcTemplate.update("insert into users " +
                        "(login,name,password,phone,address,image,description,instaLogin,type) " + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)"
                , userMaster.getLogin()
                , userMaster.getName()
                , userMaster.getPassword()
                , userMaster.getPhone()
                , userMaster.getAddress()
                , userMaster.getImage()
                , userMaster.getDescription()
                , userMaster.getInstaLogin()
                , userMaster.getType());

        if (resCount > 0) {
            return jdbcTemplate.queryForObject("SELECT MAX(id) FROM userMaster", Integer.class);
        }
        return -1;
    }

    public int update(User user) {
        return jdbcTemplate.update("update users "
                        + "set login = ?, " +
                        "name = ?, password =?, " +
                        "phone = ?,address =?, " +
                        "image =?, description =?," +
                        "instaLogin=?, status=?," +
                        "type =?, token = ?" +
                        " where id = ?",
                user.getLogin(),
                user.getName(),
                user.getPassword(),
                user.getPhone(),
                user.getAddress(),
                user.getImage(),
                user.getDescription(),
                user.getInstaLogin(),
                user.getStatus(),
                user.getType(),
                user.getToken(),
                user.getId());
    }


}



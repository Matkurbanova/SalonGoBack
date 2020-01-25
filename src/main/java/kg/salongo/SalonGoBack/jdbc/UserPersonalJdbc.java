package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.UserPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserPersonalJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;


    class UserPersonalRowMapper implements RowMapper<UserPersonal> {

        @Override
        public UserPersonal mapRow(ResultSet rs, int rowNum) throws SQLException {
            UserPersonal userPersonal = new UserPersonal();
            userPersonal.setId(rs.getInt("id"));
            userPersonal.setLogin(rs.getString("login"));
            userPersonal.setPassword(rs.getString("password"));
            userPersonal.setPhone(rs.getString("phone"));
            userPersonal.setName(rs.getString("name"));
            userPersonal.setAvatarimages(rs.getString("avatarimages"));
            return userPersonal;
        }
    }

    public List<UserPersonal> findAll() {
        return jdbcTemplate.query("SELECT * FROM UserPersonal",
                new UserPersonalRowMapper());
    }

    public UserPersonal findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM UserPersonal WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(UserPersonal.class));
    }

    public UserPersonal findByLogin(String login) {
        return jdbcTemplate.queryForObject("SELECT * FROM UserPersonal WHERE LOGIN=?", new Object[]{login},
                new BeanPropertyRowMapper<>(UserPersonal.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM UserPersonal WHERE id=?",
                new Object[]{id});

    }

    public int insert(UserPersonal userPersonal) {
        return jdbcTemplate.update("insert into userPersonal (id,login, password, phone,name,avatarimages) " + "values(?, ?, ?, ?, ?)",
                userPersonal.getId(),
                 userPersonal.getLogin()
                , userPersonal.getPassword()
                , userPersonal.getPhone()
                , userPersonal.getName()
                , userPersonal.getAvatarimages());


    }

    public int update(UserPersonal userPersonal) {
        return jdbcTemplate.update("update userPersonal " + "set login = ?, password = ?, phone = ?,name = ?, avatarimages = ?" +
                        " where id = ?",
                userPersonal.getLogin(),
                userPersonal.getPassword(),
                userPersonal.getPhone(),
                userPersonal.getName(),
                userPersonal.getAvatarimages(),
                userPersonal.getId());
    }
}



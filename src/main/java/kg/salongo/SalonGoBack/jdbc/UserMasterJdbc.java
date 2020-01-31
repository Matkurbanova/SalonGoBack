package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.UserMaster;
import kg.salongo.SalonGoBack.entity.UserPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class UserMasterJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<UserMaster> findAll() {
        return jdbcTemplate.query("SELECT*FROM UserMaster",
                new BeanPropertyRowMapper<>(UserMaster.class));
    }

    public UserMaster findById(int id) {
        return jdbcTemplate.queryForObject("SELECT*FROM UserMaster WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(UserMaster.class));


    }

    public UserMaster findByLogin(String login) {
        try {
            return jdbcTemplate.queryForObject("SELECT*FROM UserMaster WHERE LOGIN=?", new Object[]{login},
                    new BeanPropertyRowMapper<>(UserMaster.class));
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM UserMaster WHERE id=?",
                new Object[]{id});

    }

    public int insert(UserMaster userMaster) {
        int resCount = jdbcTemplate.update("insert into userMaster " +
                        "(typeStatus,login,name,password,phone,workExperienceYear,ImageMaster,Description,Instagram) " + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)",
                userMaster.getTypeStatus()
                , userMaster.getLogin()
                , userMaster.getName()
                , userMaster.getPassword()
                , userMaster.getPhone()
                , userMaster.getWorkExperienceYear()
                , userMaster.getImageMaster()
                , userMaster.getDescription()
                , userMaster.getInstagram());

        if (resCount > 0) {
            return jdbcTemplate.queryForObject("SELECT MAX(id) FROM userMaster", Integer.class);
        }
        return -1;
    }

    public int update(UserMaster userMaster) {
        return jdbcTemplate.update("update userMaster " + "set typeStatus = ?, login = ?, name = ?, password =?, phone = ?, workExperienceYear = ?, ImageMaster =?,Description =?,Instagram =?, token = ?" +
                        " where id = ?",
                userMaster.getTypeStatus(),
                userMaster.getLogin(),
                userMaster.getName(),
                userMaster.getPassword(),
                userMaster.getPhone(),
                userMaster.getWorkExperienceYear(),
                userMaster.getImageMaster(),
                userMaster.getDescription(),
                userMaster.getInstagram(),
                userMaster.getToken(),
                userMaster.getId());
    }


}



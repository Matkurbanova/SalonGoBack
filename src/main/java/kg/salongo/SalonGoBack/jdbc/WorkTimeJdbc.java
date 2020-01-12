package kg.salongo.SalonGoBack.jdbc;
import kg.salongo.SalonGoBack.entity.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkTimeJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<WorkTime> findAll(){
        return jdbcTemplate.query("SELECT*FROM WorkTime",
                new BeanPropertyRowMapper<>(WorkTime.class));
    }
    public WorkTime findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM WorkTime WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(WorkTime.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM WorkTime WHERE id=?",
                new Object[]{id});

    }
}



package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Service;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceMasterJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ServiceMaster> findAll(){
        return jdbcTemplate.query("SELECT*FROM ServiceMaster",
                new BeanPropertyRowMapper<>(ServiceMaster.class));
    }
    public ServiceMaster findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT*FROM ServiceMaster WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<>(ServiceMaster.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM ServiceMaster WHERE id=?",
                new Object[]{id});

    }
}



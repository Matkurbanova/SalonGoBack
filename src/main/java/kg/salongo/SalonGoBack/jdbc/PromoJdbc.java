package kg.salongo.SalonGoBack.jdbc;

import kg.salongo.SalonGoBack.entity.Promo;
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
public class PromoJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;



    public List<Promo> findAll(){
        return jdbcTemplate.query("SELECT * FROM Promo",
                new BeanPropertyRowMapper<>(Promo.class));

    }
    public Promo findById(int id) {
        return  jdbcTemplate.queryForObject("SELECT * FROM Promo WHERE id=?",new Object[]{id},
                new BeanPropertyRowMapper<>(Promo.class));
    }

    public Promo findByLogin(int SalonId) {
        return  jdbcTemplate.queryForObject("SELECT * FROM Promo WHERE SalonId=?",new Object[]{SalonId},
                new BeanPropertyRowMapper<>(Promo.class));
    }

    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Promo WHERE id=?",
                new Object[]{id});

    }

public int insert(Promo promo){
return jdbcTemplate.update("insert into promo (id, SalonId, MasterId, newPrice,oldPrice,promoDescription,productInfo,promoImage) " + "values(?, ?, ?, ?, ?, ?, ?, ?)",
        new Object[]{promo.getId(),promo.getSalonId(),promo.getUserMasterId(),promo.getNewPrice(),promo.getOldPrice(),promo.getPromoDescription(),
                promo.getProductInfo(),promo.getPromoImage()});

}
public int update(Promo promo){
return jdbcTemplate.update("update promo " + "set id = ?, SalonId = ?, MasterId = ?, newPrice = ?,  oldPrice = ?, promoDescription = ?,productInfo = ?, avatarimages = 1" +
        "where id = ?", new Object[]{promo.getId(),promo.getSalonId(),promo.getUserMasterId(),promo.getNewPrice(),promo.getOldPrice(),promo.getPromoDescription(),
        promo.getProductInfo(),promo.getPromoImage()});
}
}



package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Saved;
import kg.salongo.SalonGoBack.jdbc.SavedJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class SavedController {
    @Autowired
    SavedJdbc savedJdbc;

    @RequestMapping("/api/saved/{userId}")
    public Response<List<Saved>> getTypes(@PathVariable("userId") int userId) {
        return new Response(savedJdbc.findByUserId(userId));
    }
}

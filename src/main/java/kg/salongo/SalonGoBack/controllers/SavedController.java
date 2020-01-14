package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Saved;
import kg.salongo.SalonGoBack.jdbc.SavedJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SavedController {
    @Autowired
    SavedJdbc savedJdbc;
    @RequestMapping("/api/saved")
    public Response<List<Saved>> getTypes() {
        return new Response(savedJdbc.findAll());
    }
}

package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserSalon;
import kg.salongo.SalonGoBack.jdbc.UserSalonJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserSalonController {
    @Autowired
    UserSalonJdbc userSalonJdbc;
    @RequestMapping("/api/usersalon")
    public Response<List<UserSalon>> getTypes() {
        return new Response(userSalonJdbc.findAll());
    }
}

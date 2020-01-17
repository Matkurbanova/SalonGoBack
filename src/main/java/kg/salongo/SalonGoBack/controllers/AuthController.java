package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.jdbc.UserPersonalJdbc;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @Autowired
    UserPersonalJdbc userPersonalJdbcJdbc;

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    public Response<UserPersonal> login(@RequestParam("login") String login, @RequestParam("password") String password) {
        try {
            UserPersonal userPersonal = userPersonalJdbcJdbc.findByLogin(login);
            return new Response(userPersonal);
        } catch (Exception ex) {
            return new Response(-1, "No user with login " + login);
        }
    }
}

package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserMaster;
import kg.salongo.SalonGoBack.entity.UserSalon;
import kg.salongo.SalonGoBack.jdbc.UserSalonJdbc;
import kg.salongo.SalonGoBack.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserSalonController {
    @Autowired
    UserSalonJdbc userSalonJdbc;
    @RequestMapping("/api/usersalon")
//    public Response<List<UserSalon>> getTypes() {
//        return new Response(userSalonJdbc.findAll());
//    }
    public Response<UserSalon> login(@RequestParam("login") String login, @RequestParam("password") String password) {

        try {
            UserSalon userSalon = userSalonJdbc.findByLogin(login.trim());
            userSalon.setToken(RandomUtils.createToken());
            userSalonJdbc.update(userSalon);
            return new Response(userSalon);

        } catch (Exception ex) {
            ex.printStackTrace();
            return new Response(-1, "No user with login " + login);
        }}}


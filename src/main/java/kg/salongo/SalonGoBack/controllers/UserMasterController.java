package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserMaster;

import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.jdbc.UserMasterJdbc;

import kg.salongo.SalonGoBack.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserMasterController {
    @Autowired
    UserMasterJdbc userMasterJdbc;
    @RequestMapping("/api/usermaster")
    public Response<UserMaster> login(@RequestParam("login") String login, @RequestParam("password") String password) {

        try {
            UserMaster userMaster = userMasterJdbc.findByLogin(login.trim());
            userMaster.setToken(RandomUtils.createToken());
            userMasterJdbc.update(userMaster);
            return new Response(userMaster);

    } catch (Exception ex) {
        ex.printStackTrace();
        return new Response(-1, "No user with login " + login);
    }}}

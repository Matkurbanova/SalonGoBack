package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserMaster;

import kg.salongo.SalonGoBack.jdbc.UserMasterJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserMasterController {
    @Autowired
    UserMasterJdbc userMasterJdbc;
    @RequestMapping("/api/usermaster")
    public Response<List<UserMaster>> getTypes() {
        return new Response(userMasterJdbc.findAll());
    }

}

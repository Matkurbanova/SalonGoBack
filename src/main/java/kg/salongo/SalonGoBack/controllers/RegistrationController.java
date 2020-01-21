package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserMaster;
import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.jdbc.UserMasterJdbc;
import kg.salongo.SalonGoBack.jdbc.UserPersonalJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {
    @Autowired
    UserPersonalJdbc userPersonalJdbc;

    @RequestMapping(value = "/api/register/personal", method = RequestMethod.POST)
    public Response register(
            @RequestParam("login") String login,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("name") String name
    ) {
        UserPersonal userPersonal = new UserPersonal(login, password, phone, name, "avatarUser.png");
        int id = userPersonalJdbc.insert(userPersonal);
        return new Response(userPersonal);
    }

    @Autowired
    UserMasterJdbc userMasterJdbc;

    @RequestMapping(value = "/api/register/master", method = RequestMethod.POST)
    public Response register(
            @RequestParam("typeStatus") int typeStatus,
            @RequestParam("login") String login,
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("phone")String phone,
            @RequestParam("workExperienceYear")String workExperienceYear,
            @RequestParam("Description")String Description,
            @RequestParam("Instagram")String Instagram



            ) {
UserMaster userMaster=new UserMaster(typeStatus,login,name,password,phone,workExperienceYear,"masteravatar.png",Description,Instagram);
int id=userMasterJdbc.insert(userMaster);
return new Response(userMaster);


}}

package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.UserMaster;
import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.entity.UserSalon;
import kg.salongo.SalonGoBack.jdbc.UserMasterJdbc;
import kg.salongo.SalonGoBack.jdbc.UserPersonalJdbc;
import kg.salongo.SalonGoBack.jdbc.UserSalonJdbc;
import kg.salongo.SalonGoBack.utils.GoFiles;
import kg.salongo.SalonGoBack.utils.RandomUtils;
import org.aspectj.weaver.patterns.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


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
        String token = RandomUtils.createToken();
        UserPersonal userPersonal = new UserPersonal(login, password, phone, name, "avatarUser.png", token);
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
            @RequestParam("phone") String phone,
            @RequestParam("workExperienceYear") String workExperienceYear,
            @RequestParam("Description") String Description,
            @RequestParam("Instagram") String Instagram,
            @RequestParam("image") MultipartFile image
    ) {

        String fileName = "";
        try {
            fileName = GoFiles.save(image, GoFiles.storage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        UserMaster userMaster = new UserMaster(typeStatus, login, name, password, phone, workExperienceYear, fileName, Description, Instagram);
        UserMaster isExists = userMasterJdbc.findByLogin(userMaster.getLogin());
        if (isExists == null) {
            int id = userMasterJdbc.insert(userMaster);
            if (id > 0) {
                userMaster.setId(id);
                return new Response(userMaster);
            } else {
                return new Response(-1, "Не удалось добавить");
            }
        } else {
            return new Response(-1, "Мастер с таким логином уже есть");
        }
    }

    @Autowired
    UserSalonJdbc userSalonJdbc;

    @RequestMapping(value = "/api/register/salon", method = RequestMethod.POST)
    public Response register(
            @RequestParam("login") String login,
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("address") String address,
            @RequestParam("description") String description,
            @RequestParam("instaLogin") String instaLogin,
            @RequestParam("image") MultipartFile image
    ) {


        String fileName = "";
        try {
            fileName = GoFiles.save(image, GoFiles.storage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String token = RandomUtils.createToken();
        UserSalon userSalon = new UserSalon(login, name, password, phone, address, description, instaLogin, fileName, token);

        UserSalon isExists = userSalonJdbc.findByLogin(userSalon.getLogin());
        if (isExists == null) {
            int id = userSalonJdbc.insert(userSalon);
            if (id > 0) {
                userSalon.setId(id);
                return new Response(userSalon);
            } else {
                return new Response(-1, "Не удалось добавить");
            }
        } else {
            return new Response(-1, "Салон с таким логином уже есть");
        }
    }
}

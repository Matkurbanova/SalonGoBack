package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Regexs;
import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.User;
import kg.salongo.SalonGoBack.jdbc.UsersJdbc;
import kg.salongo.SalonGoBack.utils.GoFiles;
import kg.salongo.SalonGoBack.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class RegistrationController {
    @Autowired
    UsersJdbc usersJDBC;

    @RequestMapping(value = "/api/register/personal", method = RequestMethod.POST)
    public Response register(
            @RequestParam("login") String login,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("name") String name
    ) {
        if (!login.trim().matches(Regexs.LOGIN_FORMAT)) {
            return new Response(-2, "Wrong login format");
        }
        String token = RandomUtils.createToken();
        User userPersonal = new User(login, name, password, phone, "avatarUser.png", token);
        int id = usersJDBC.insert(userPersonal);
        userPersonal.setId(id);
        return new Response(userPersonal);
    }

    @RequestMapping(value = "/api/register/master", method = RequestMethod.POST)
    public Response register(
            @RequestParam("login") String login,
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("workExperienceYear") String workExperienceYear,
            @RequestParam(value = "image", required = false) MultipartFile image
    ) {
        if (!login.trim().matches(Regexs.LOGIN_FORMAT)) {
            return new Response(-2, "Wrong login format");
        }

        String fileName = "";
        try {
            fileName = GoFiles.save(image, GoFiles.storage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        User user = new User(login, name, password, phone, workExperienceYear, fileName);
        User isExists = usersJDBC.findByLogin(user.getLogin());
        if (isExists == null) {
            int id = usersJDBC.insert(user);
            if (id > 0) {
                user.setId(id);
                return new Response(user);
            } else {
                return new Response(-1, "Не удалось добавить");
            }
        } else {
            return new Response(-1, "Пользователь с таким логином уже есть");
        }
    }

    @RequestMapping(value = "/api/register/salon", method = RequestMethod.POST)
    public Response register(
            @RequestParam("login") String login,
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("address") String address,
            @RequestParam("description") String description,
            @RequestParam("instaLogin") String instaLogin,
            @RequestParam("typeStatus") int typeStatus,
            @RequestParam("image") MultipartFile image
    ) {

        if (!login.trim().matches(Regexs.LOGIN_FORMAT)) {
            return new Response(-2, "Wrong login format");
        }

        String fileName = "";
        try {
            fileName = GoFiles.save(image, GoFiles.storage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String token = RandomUtils.createToken();
        User user = new User(
                login, name,
                password, phone,
                fileName, address,
                description, instaLogin, 0, 3, token);

        User isExists = usersJDBC.findByLogin(user.getLogin());
        if (isExists == null) {
            int id = usersJDBC.insert(user);
            if (id > 0) {
                user.setId(id);
                return new Response(user);
            } else {
                return new Response(-1, "Не удалось добавить");
            }
        } else {
            return new Response(-1, "Пользователь с таким логином уже есть");
        }
    }
}
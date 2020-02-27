package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.User;
import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.jdbc.UsersJdbc;
import kg.salongo.SalonGoBack.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @Autowired
    UsersJdbc usersJdbc;

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    public Response<UserPersonal> login(@RequestParam("login") String login,
                                        @RequestParam("password") String password) {
        try {
            User user = usersJdbc.findByLogin(login.trim());
            user.setToken(RandomUtils.createToken());
            usersJdbc.update(user);

            return new Response(user);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new Response(-1, "No user with login " + login);

        }
        /* TODO:
* MD5 шифрование пароля
* проверка пароля

*
*
* */
    }
}

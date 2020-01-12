package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.TypeService;
import kg.salongo.SalonGoBack.jdbc.TypeServiceJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    @Autowired
    TypeServiceJdbc typeServiceJdbc;

    @RequestMapping("/api/types")
    public Response<List<TypeService>> getTypes() {
        return new Response(typeServiceJdbc.findAll());
    }

}

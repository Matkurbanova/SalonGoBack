package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.SubTypeService;
import kg.salongo.SalonGoBack.jdbc.SubTypeServiceJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubTypeController {
    @Autowired
    SubTypeServiceJdbc subTypesServiceJdbc;
    @RequestMapping("/api/subtypes")
    public Response<List<SubTypeService>> getTypes() {
        return new Response(subTypesServiceJdbc.findAll());
    }

}

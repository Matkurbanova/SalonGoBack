package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Category;
import kg.salongo.SalonGoBack.jdbc.CategoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryJdbc categoryJdbcJdbc;

    @RequestMapping("/api/category")
    public Response<List<Category>> getTypes() {
        return new Response(categoryJdbcJdbc.findAll());
    }

}

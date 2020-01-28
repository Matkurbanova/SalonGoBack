package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Category;
import kg.salongo.SalonGoBack.jdbc.CategoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryJdbc categoryJdbc;

    @RequestMapping("/api/category")
    public Response<List<Category>> getTypes() {
        return new Response(categoryJdbc.findAll());
    }
    @RequestMapping("/api/category/{id}")
    public Response<List<Category>>getCategoryById(@PathVariable int id){
        return new Response(categoryJdbc.findById(id));
    }


}

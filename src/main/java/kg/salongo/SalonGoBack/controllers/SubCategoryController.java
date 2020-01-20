package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.SubCategory;
import kg.salongo.SalonGoBack.jdbc.SubCategoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCategoryController {
    @Autowired
    SubCategoryJdbc subCategoryJdbc;

    @RequestMapping("/api/subcategory/{CategoryId}")
    public Response<List<SubCategory>> getSubcategories(@PathVariable("CategoryId") int catId) {
        return new Response(subCategoryJdbc.findByCategoryId(catId));
    }

    }



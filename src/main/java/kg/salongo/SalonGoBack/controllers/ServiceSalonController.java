package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.data.ServiceBySubCat;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;

import kg.salongo.SalonGoBack.entity.SubCategory;
import kg.salongo.SalonGoBack.jdbc.ServiceSalonJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceSalonController {
    @Autowired
    ServiceSalonJdbc serviceSalonJdbc;

    @RequestMapping("/api/servicesalon/{SubCategoryId}")
    public Response<List<ServiceBySubCat>> getServiceSalons(@PathVariable("SubCategoryId") int serviceSalonId) {
        return new Response(serviceSalonJdbc.findBySubCategory(serviceSalonId));
    }

    @RequestMapping(value = "/api/servicesalon/add", method = RequestMethod.POST)
    public ResponseEntity<Response<ServiceSalon>> addServiceSalon(
            @RequestHeader("token") String token,
            @RequestParam("name") String name,
            @RequestParam("price") String price) {
        ServiceSalon salon = serviceSalonJdbc.findByToken(token);
        if (salon != null) {

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}

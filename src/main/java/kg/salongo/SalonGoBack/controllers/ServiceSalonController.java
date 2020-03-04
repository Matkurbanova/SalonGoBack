package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.data.ServiceBySubCat;
import kg.salongo.SalonGoBack.entity.*;

import kg.salongo.SalonGoBack.jdbc.ServiceSalonJdbc;

import kg.salongo.SalonGoBack.jdbc.UsersJdbc;
import kg.salongo.SalonGoBack.utils.GoFiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class ServiceSalonController {
    @Autowired
    ServiceSalonJdbc serviceSalonJdbc;

    @Autowired
    UsersJdbc usersJdbc;

    @RequestMapping("/api/servicesalon/{SubCategoryId}")
    public Response<List<ServiceBySubCat>> getServiceSalons(@PathVariable("SubCategoryId") int serviceSalonId) {
        return new Response(serviceSalonJdbc.findBySubCategory(serviceSalonId));
    }

    @RequestMapping("/api/servicesalon/saloncategories/{salonId}")
    public Response<List<Category>> getMoreServiceSalons(
            @PathVariable("salonId") int salonId) {

        return new Response(serviceSalonJdbc.findByUserSalon(salonId));
    }
    @RequestMapping("/api/servicesalon/salonsubcategories/{salonId}/{categoryId}")
    public Response<List<SubCategory>> findByCategoryId(
            @PathVariable("salonId") int salonId,
            @PathVariable("categoryId") int categoryId) {
        return new Response(serviceSalonJdbc.findByCategoryId(salonId, categoryId));

    }
    @RequestMapping("/api/servicesalon/salonservice/{salonId}/{subcategoryId}")
    public Response<List<ServiceSalon>> findBySubCategoryId(
            @PathVariable("salonId") int salonId,
            @PathVariable("subcategoryId") int subcategoryId) {
        return new Response(serviceSalonJdbc.findBySubCategoryId(salonId, subcategoryId));

    }


    @RequestMapping(value = "/api/servicesalon/add", method = RequestMethod.POST)
    public ResponseEntity<Response<ServiceSalon>> addServiceSalon(
            @RequestHeader("token") String token,
            @RequestParam("SubCategoryId") int SubCategoryId,
            @RequestParam("Price") String Price,
            @RequestParam("Description") String Description,
            @RequestParam("Image") MultipartFile Image) {
        User user = usersJdbc.findByToken(token);
        {
            if (user != null && user.getType() == 3) {
                ServiceSalon serviceSalon = new ServiceSalon();
                serviceSalon.setSalonId(user.getId());
                serviceSalon.setSubCategoryId(SubCategoryId);
                serviceSalon.setPrice(Price);
                serviceSalon.setDescription(Description);
                try {
                    String fileName = GoFiles.save(Image);
                    serviceSalon.setImage(fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int res = serviceSalonJdbc.save(serviceSalon);
                if (res > 0) {
                    return ResponseEntity.ok(new Response(serviceSalon));
                } else {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
                }
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
            }

        }
    }
}

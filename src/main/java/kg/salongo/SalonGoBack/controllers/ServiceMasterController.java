package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.data.ServiceMasterBySubCat;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.jdbc.ServiceMasterJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceMasterController {
    @Autowired
    ServiceMasterJdbc serviceMasterJdbc;

    @RequestMapping("/api/servicemaster/{SubCategoryId}")
    public Response<List<ServiceMasterBySubCat>> getServiceMasters(@PathVariable("SubCategoryId") int serviceMasterId) {
        return new Response(serviceMasterJdbc.findBySubCategory(serviceMasterId));
    }


    @RequestMapping(value = "/api/servicemaster/add", method = RequestMethod.POST)
    public ResponseEntity<Response<ServiceMaster>> addServiceMaster(
            @RequestHeader("token") String token,
            @RequestParam("name") String name,
            @RequestParam("price") String price) {
        ServiceMaster master = serviceMasterJdbc.findByToken(token);
        if (master != null) {
// TODO: добавить услугу
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}





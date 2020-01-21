package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;
import kg.salongo.SalonGoBack.jdbc.ServiceMasterJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceMasterController {
        @Autowired
        ServiceMasterJdbc serviceMasterJdbc;

        @RequestMapping("/api/servicemaster/{SubCategoryId}")
        public Response<List<ServiceMaster>> getServiceMasters(@PathVariable("SubCategoryId")int serviceMasterId) {
            return new Response(serviceMasterJdbc.findByUserMasterId(serviceMasterId));
        }
//    public Response<List<ServiceSalon>> getServiceSalons(@PathVariable("SubCategoryId")int serviceSalonId) {
//        return new Response(serviceSalonJdbc.findBySalonId(serviceSalonId));
    }




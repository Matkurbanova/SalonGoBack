package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.jdbc.ServiceMasterJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceMasterController {
    @Autowired
    ServiceMasterJdbc serviceMasterJdbc;
    @RequestMapping("/api/serviceMaster")
    public Response<List<ServiceMaster>> getTypes() {
        return new Response(serviceMasterJdbc.findAll());
    }

}

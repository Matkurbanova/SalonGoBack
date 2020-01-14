package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.ServiceSalon;

import kg.salongo.SalonGoBack.jdbc.ServiceSalonJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
        @Autowired
        ServiceSalonJdbc serviceJdbc;

        @RequestMapping("/api/service")
        public Response<List<ServiceSalon>> getTypes() {
            return new Response(serviceJdbc.findAll());
        }

    }




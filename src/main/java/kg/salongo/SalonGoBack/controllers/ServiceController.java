package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Service;

import kg.salongo.SalonGoBack.jdbc.ServiceJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
        @Autowired
    ServiceJdbc serviceJdbc;

        @RequestMapping("/api/service")
        public Response<List<Service>> getTypes() {
            return new Response(serviceJdbc.findAll());
        }

    }




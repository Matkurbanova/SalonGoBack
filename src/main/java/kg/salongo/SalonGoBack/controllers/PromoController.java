package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Promo;
import kg.salongo.SalonGoBack.entity.ServiceSalon;
import kg.salongo.SalonGoBack.jdbc.PromoJdbc;
import kg.salongo.SalonGoBack.jdbc.ServiceSalonJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromoController {
        @Autowired
    PromoJdbc promoJdbc;
        @RequestMapping("/api/promo")
        public Response<List<Promo>> getTypes() {
            return new Response(promoJdbc.findAll());
        }

    }




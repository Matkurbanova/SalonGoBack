package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.ImagesSalon;
import kg.salongo.SalonGoBack.jdbc.ImagesSalonJdbc;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class ImagesSalonController {
    @Autowired
    ImagesSalonJdbc imagesSalonJdbc;

    @RequestMapping("/api/imagessalon")
    public Response<List<ImagesSalon>> getTypes() {
        return new Response(imagesSalonJdbc.findAll());
    }

    @RequestMapping("/api/imagesalon/{name}")
    public void getImage(@PathVariable("name") String name, HttpServletResponse servletResponse) {
        try {
            Resource resource = new ClassPathResource("imagessalon/" + name);
            InputStream inputStream = resource.getInputStream();
            IOUtils.copy(inputStream, servletResponse.getOutputStream());
            servletResponse.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

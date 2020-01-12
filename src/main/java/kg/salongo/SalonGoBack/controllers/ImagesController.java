package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.Images;
import kg.salongo.SalonGoBack.jdbc.ImagesJdbc;
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
public class ImagesController {
    @Autowired
    ImagesJdbc imagesJdbc;

    @RequestMapping("/api/images")
    public Response<List<Images>> getTypes() {
        return new Response(imagesJdbc.findAll());
    }

    @RequestMapping("/api/image/{name}")
    public void getImage(@PathVariable("name") String name, HttpServletResponse servletResponse) {
        try {
            Resource resource = new ClassPathResource("images/" + name);
            InputStream inputStream = resource.getInputStream();
            IOUtils.copy(inputStream, servletResponse.getOutputStream());
            servletResponse.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

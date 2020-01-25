package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.entity.ImagesMaster;
import kg.salongo.SalonGoBack.entity.ImagesSalon;
import kg.salongo.SalonGoBack.jdbc.ImagesMasterJdbc;
import kg.salongo.SalonGoBack.utils.GoFiles;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class FilesController {
    @Autowired
    ImagesMasterJdbc imagesMasterJdbc;

    @RequestMapping("/api/images")
    public Response<List<ImagesMaster>> getTypes() {
        return new Response(imagesMasterJdbc.findAll());
    }

    @RequestMapping("/api/image/{name}")
    public ResponseEntity<Resource> getImage(@PathVariable("name") String name) {
        Resource file = null;
        try {
            file = GoFiles.loadAsResource(name, GoFiles.storage);
            return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                    "attachment; filename=\"" + file.getFilename() + "\"").body(file);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(file);
        }
        /*try {
            Resource resource = new ClassPathResource("images/" + name);
            InputStream inputStream = resource.getInputStream();
            IOUtils.copy(inputStream, servletResponse.getOutputStream());
            servletResponse.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @RequestMapping("/api/image/service/{name}")
    public ResponseEntity<Resource> getServiceImage(@PathVariable("name") String name) {
        Resource file = null;
        try {
            file = GoFiles.loadAsResource(name, GoFiles.serviceImagesStorage);
            return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                    "attachment; filename=\"" + file.getFilename() + "\"").body(file);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(file);
        }
    }
}

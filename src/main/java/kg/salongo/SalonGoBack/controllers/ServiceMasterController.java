package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.data.ServiceMasterBySubCat;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.User;
import kg.salongo.SalonGoBack.jdbc.ServiceMasterJdbc;
import kg.salongo.SalonGoBack.jdbc.UsersJdbc;
import kg.salongo.SalonGoBack.utils.GoFiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class ServiceMasterController {
    @Autowired
    ServiceMasterJdbc serviceMasterJdbc;
    @Autowired
    UsersJdbc usersJdbc;

    @RequestMapping("/api/servicemaster/{SubCategoryId}")
    public Response<List<ServiceMasterBySubCat>> getServiceMasters(@PathVariable("SubCategoryId") int serviceMasterId) {
        return new Response(serviceMasterJdbc.findBySubCategory(serviceMasterId));
    }


    @RequestMapping(value = "/api/servicemaster/add", method = RequestMethod.POST)
    public ResponseEntity<Response<ServiceMaster>> addServiceMaster(
            @RequestHeader("token") String token,
            @RequestParam("Price") String Price,
            @RequestParam("Description") String Description,
            @RequestParam("SubCategoryId") int subCategoryId,
            @RequestParam("Image") MultipartFile Image
    ) {

        User master = usersJdbc.findByToken(token);
        if (master != null && master.getType() == 2) {
            ServiceMaster serviceMaster = new ServiceMaster();
            serviceMaster.setUserMasterId(master.getId());
            serviceMaster.setPrice(Price);
            serviceMaster.setSubCategoryId(subCategoryId);
            serviceMaster.setDescription(Description);

            try {
                String fileName = GoFiles.save(Image);
                serviceMaster.setImage(fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }

            int res = serviceMasterJdbc.save(serviceMaster);
            if (res > 0) {
                return ResponseEntity.ok(new Response(serviceMaster));
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

}





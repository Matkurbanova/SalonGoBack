package kg.salongo.SalonGoBack.controllers;

import kg.salongo.SalonGoBack.Response;
import kg.salongo.SalonGoBack.data.ServiceMasterBySubCat;
import kg.salongo.SalonGoBack.entity.Category;
import kg.salongo.SalonGoBack.entity.ServiceMaster;
import kg.salongo.SalonGoBack.entity.SubCategory;
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

    @RequestMapping("/api/servicemaster/mastercategories/{masterId}")
    public Response<List<Category>> getMoreServiceMasters(
            @PathVariable("masterId") int masterId) {
//        User master = usersJdbc.findByToken(token);
//        if (master.getType() != 2) {
//            return new Response(-1, "You are not master");
//        }
        return new Response(serviceMasterJdbc.findByUserMaster(masterId));
    }

    @RequestMapping("/api/servicemaster/mastersubcategories/{masterId}/{categoryId}")
    public Response<List<SubCategory>> findByCategoryId(
            @PathVariable("masterId") int masterId,
            @PathVariable("categoryId") int categoryId) {
        return new Response(serviceMasterJdbc.findByCategoryId(masterId, categoryId));

    }
    @RequestMapping("/api/servicemaster/masterservice/{masterId}/{subcategoryId}")
    public Response<List<ServiceMaster>> findBySubCategoryId(
            @PathVariable("masterId") int masterId,
            @PathVariable("subcategoryId") int subcategoryId) {
        return new Response(serviceMasterJdbc.findBySubCategoryId(masterId, subcategoryId));

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





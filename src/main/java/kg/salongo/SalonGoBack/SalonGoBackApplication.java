package kg.salongo.SalonGoBack;

import kg.salongo.SalonGoBack.entity.UserPersonal;
import kg.salongo.SalonGoBack.jdbc.*;
import kg.salongo.SalonGoBack.utils.GoFiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SalonGoBackApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SubCategoryJdbc subCategoryJdbc;
    CategoryJdbc categoryJdbcJdbc;
    @Autowired
    UserPersonalJdbc userPersonalJdbc;
    UserSalonJdbc userSalonJdbc;
    WorkTimeJdbc workTimeJdbc;
    ServiceSalonJdbc serviceJdbc;
    SavedJdbc savedJdbc;
    ImagesSalonJdbc imagesSalonJdbc;
    UserMasterJdbc userMasterJdbc;
    ServiceMasterJdbc serviceMasterJdbc;
    ImagesMasterJdbc imagesMasterJdbc;

    public static void main(String[] args) {
        SpringApplication.run(SalonGoBackApplication.class, args);
    }

    public void run(String... args) throws Exception {
//        logger.info("{} user has been added to the DB",
//                userPersonalJdbc.insert(new UserPersonal(1, "bermet03", "bema123", "+996555555555", "Bermet", "avatarUser.png")));
//        logger.info("All Users {}", userPersonalJdbc.findAll());
//        logger.info("User with id 1 -> {}", userPersonalJdbc.findById(1));
//        logger.info("Update 1 -> {}", userPersonalJdbc.update(new UserPersonal(1, "julya033", "julya123", "+9965555577777", "Julya", "avatarUser.png")));
////        logger.info("Deleting user with id 1, # of deleted records = {}",
////                userPersonalJdbc.deleteById(1));
//

    }
}
package kg.salongo.SalonGoBack;

import kg.salongo.SalonGoBack.jdbc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalonGoBackApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	SubCategoryJdbc subCategoryJdbc;
	CategoryJdbc categoryJdbcJdbc;
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
		logger.info("All Users {}", subCategoryJdbc.findAll());
		logger.info("User with id 10003 -> {}", subCategoryJdbc.findById(10003));
		logger.info("Deleting user with id 10002, # of deleted records = {}",
				subCategoryJdbc.deleteById(10002));
	}
//	 {
//		logger.info("All Users {}", typeServiceJdbc.findAll());
//		logger.info("User with id 10003 -> {}", typeServiceJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				typeServiceJdbc.deleteById(10003));
//
//}
//	{
//		logger.info("All Users {}", userPersonalJdbc.findAll());
//		logger.info("User with id 10003 -> {}", userPersonalJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				userPersonalJdbc.deleteById(10002));
//}{
//		logger.info("All Users {}", userSalonJdbc.findAll());
//		logger.info("User with id 10003 -> {}", userSalonJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				userSalonJdbc.deleteById(10002));
//
//	}
//	{
//		logger.info("All Users {}", workTimeJdbc.findAll());
//		logger.info("User with id 10003 -> {}", workTimeJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				workTimeJdbc.deleteById(10002));
//
//	}
//	{
//		logger.info("All Users {}", savedJdbc.findAll());
//		logger.info("User with id 10003 -> {}", savedJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				savedJdbc.deleteById(10002));
//
//	}
//	{
//		logger.info("All Users {}", serviceJdbc.findAll());
//		logger.info("User with id 10003 -> {}", serviceJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				serviceJdbc.deleteById(10002));
//
//	}
//	{
//		logger.info("All Users {}", imagesJdbc.findAll());
//		logger.info("User with id 10003 -> {}", imagesJdbc.findById(10003));
//		logger.info("Deleting user with id 10002, # of deleted records = {}",
//				imagesJdbc.deleteById(10002));
//
//	}
}

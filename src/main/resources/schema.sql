Create TABLE Category
(
  id int not null auto_increment primary key,
  nameCategory varchar(150) not null,
  image varchar(150) not null
);

Create TABLE SubCategory
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    CategoryId INT,
    name varchar(150) not null,
FOREIGN KEY (CategoryId)  REFERENCES category (Id)

);

Create TABLE UserSalon
(
  id int not null auto_increment primary key,
  login varchar(150) not null,
  name varchar(150) not null,
  password varchar(255) not null,
  phone varchar(150) not null,
  address varchar(150) not null,
  description varchar(255) not null,
  instaLogin varchar(150) not null,
  logoSalon varchar(150) not null


);

Create TABLE UserPersonal
(
  id int not null auto_increment primary key,
  login varchar(150) not null,
  password varchar(150) not null,
  phone varchar(255) not null,
  name varchar(150) not null,
  avatarimages varchar(150) not null


);

Create TABLE ServiceSalon
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    SalonId INT,
    SubCategoryId INT,
    Price varchar(150),
    Description varchar (250),
    Image varchar(150),
FOREIGN KEY (SalonId)  REFERENCES UserSalon (Id),
FOREIGN KEY (SubCategoryId)  REFERENCES SubCategory (Id)
);

Create TABLE Saved
(
    UserId INT,
    ServiceSalonId INT,


FOREIGN KEY (UserId)  REFERENCES userpersonal (Id),
FOREIGN KEY (ServiceSalonId)  REFERENCES ServiceSalon (Id)

);

Create TABLE ImagesSalon
(
id int not null auto_increment primary key,
    ServiceSalonId INT,
    Image varchar(150),
FOREIGN KEY (ServiceSalonId)  REFERENCES ServiceSalon (Id)
);

Create TABLE WorkTime
(
    id INT AUTO_INCREMENT NOT NULL,
    SalonId INT,
    day TINYINT,
    time_begin varchar(5),
    time_end varchar(5),
    PRIMARY KEY(id),
    FOREIGN KEY (SalonId)  REFERENCES usersalon (Id)
);

Create TABLE UserMaster
(
  id int not null auto_increment primary key,
  typeStatus int(2) not null,
  login varchar(150) not null,
  name varchar(150) not null,
  password varchar(255) not null,
  phone varchar(150) not null,
  workExperienceYear varchar(150) not null,
  ImageMaster varchar(150) not null,
  Description varchar(550) not null,
  Instagram varchar(150)
);
Create TABLE ServiceMaster
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    UserMasterId INT,
    SubCategoryId INT,
    Price varchar(150),
    Description varchar (250),
    Image varchar(150),
FOREIGN KEY (UserMasterId)  REFERENCES UserMaster (Id),
FOREIGN KEY (SubCategoryId)  REFERENCES SubCategory (Id)
);

Create TABLE ImagesMaster
(
id int not null auto_increment primary key,
    ServiceMasterId INT,
    Image varchar(150),
FOREIGN KEY (ServiceMasterId)  REFERENCES ServiceMaster (Id)
);

Create TABLE Promo
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    SalonId INT,
    UserMasterId INT,
    newPrice varchar(150),
    oldPrice varchar(150),
    promoDescription varchar (250),
    promoImage varchar(150),
FOREIGN KEY (UserMasterId)  REFERENCES UserMaster (Id)
);

--drop table if exists oauth_client_details;
--create table oauth_client_details (
--  client_id VARCHAR(255) PRIMARY KEY,
--  resource_ids VARCHAR(255),
--  client_secret VARCHAR(255),
--  scope VARCHAR(255),
--  authorized_grant_types VARCHAR(255),
--  web_server_redirect_uri VARCHAR(255),
--  authorities VARCHAR(255),
--  access_token_validity INTEGER,
--  refresh_token_validity INTEGER,
--  additional_information VARCHAR(4096),
--  autoapprove VARCHAR(255)
--);
--
--drop table if exists oauth_client_token;
--create table oauth_client_token (
--  token_id VARCHAR(255),
--  token LONG VARBINARY,
--  authentication_id VARCHAR(255) PRIMARY KEY,
--  user_name VARCHAR(255),
--  client_id VARCHAR(255)
--);
--
--drop table if exists oauth_access_token;
--create table oauth_access_token (
--  token_id VARCHAR(255),
--  token LONG VARBINARY,
--  authentication_id VARCHAR(255) PRIMARY KEY,
--  user_name VARCHAR(255),
--  client_id VARCHAR(255),
--  authentication LONG VARBINARY,
--  refresh_token VARCHAR(255)
--);
--
--drop table if exists oauth_refresh_token;
--create table oauth_refresh_token (
--  token_id VARCHAR(255),
--  token LONG VARBINARY,
--  authentication LONG VARBINARY
--);
--
--drop table if exists oauth_code;
--create table oauth_code (
--  code VARCHAR(255), authentication LONG VARBINARY
--);
--
--drop table if exists oauth_approvals;
--create table oauth_approvals (
--    userId VARCHAR(255),
--    clientId VARCHAR(255),
--    scope VARCHAR(255),
--    status VARCHAR(10),
--    expiresAt TIMESTAMP,
--    lastModifiedAt TIMESTAMP
--);
--
--drop table if exists ClientDetails;
--create table ClientDetails (
--  appId VARCHAR(255) PRIMARY KEY,
--  resourceIds VARCHAR(255),
--  appSecret VARCHAR(255),
--  scope VARCHAR(255),
--  grantTypes VARCHAR(255),
--  redirectUrl VARCHAR(255),
--  authorities VARCHAR(255),
--  access_token_validity INTEGER,
--  refresh_token_validity INTEGER,
--  additionalInformation VARCHAR(4096),
--  autoApproveScopes VARCHAR(255)
--);
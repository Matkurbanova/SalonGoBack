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
  Instagram varchar(150) not null


);
Create TABLE ServiceMaster
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    UserMasterId INT,
    Price varchar(150),
    Description varchar (250),
    Image varchar(150),
FOREIGN KEY (UserMasterId)  REFERENCES UserMaster (Id)
);

Create TABLE ImagesMaster
(
id int not null auto_increment primary key,
    ServiceMasterId INT,
    Image varchar(150),
FOREIGN KEY (ServiceMasterId)  REFERENCES ServiceMaster (Id)
);


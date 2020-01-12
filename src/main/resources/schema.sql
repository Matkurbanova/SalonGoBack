Create TABLE TypeService
(
  id int not null auto_increment primary key,
  nameService varchar(150) not null,
  image varchar(150) not null

);

Create TABLE SubTypeService
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    TypeServiceId INT,
    name varchar(150) not null,
FOREIGN KEY (TypeServiceId)  REFERENCES typeservice (Id)

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
  imageLogo varchar(150) not null


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

Create TABLE Service
(
Id INT PRIMARY KEY AUTO_INCREMENT,
    SalonId INT,
    SubTypeServiceId INT,
    Price varchar(150),
    Description varchar (250),
    Image varchar(150),
FOREIGN KEY (SalonId)  REFERENCES UserSalon (Id),
FOREIGN KEY (SubTypeServiceId)  REFERENCES SubTypeService (Id)
);

Create TABLE Saved
(
    UserId INT,
    ServiceId INT,
FOREIGN KEY (UserId)  REFERENCES userpersonal (Id),
FOREIGN KEY (ServiceId)  REFERENCES service (Id)
);

Create TABLE Images
(
id int not null auto_increment primary key,
    ServiceId INT,
    Image varchar(150),
FOREIGN KEY (ServiceId)  REFERENCES service (Id)
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

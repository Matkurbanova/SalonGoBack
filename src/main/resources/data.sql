INSERT INTO Category(id,nameCategory,image)
VALUES(1,'Ногтевой сервис','ManikurFoto.png');

INSERT INTO SubCategory(id,name,CategoryId)
VALUES(01,'Ногтевой сервис',1);

INSERT INTO UserSalon(id,login,name,password,phone,address,description,instaLogin,logoSalon)
VALUES(1,'bermet03','Bermet','123','+996770595959','5-й микрорайон, 63Б
5 м-н, Октябрьский район, Бишкек','Мы всегда рады видеть новых гостей в нашем салоне красоты!
Широкий спектр услуг, отличное качество - по приемлемым ценам.','salon03','imageLogo.png');

INSERT INTO UserPersonal(id,login,password,phone,name,avatarimages)
VALUES(1,'matber03','bema123','+996555555555','Bermet','avatarUser.png');

INSERT INTO ServiceSalon(Id ,Price ,Description ,Image )
VALUES(1 ,'1000 сом','Наращивание ногтей Аквариумный дизайн','akvarium_nails.jpg');
UPDATE ServiceSalon SET SalonId = '1' WHERE ID = 1;
UPDATE ServiceSalon SET SubCategoryId = '1' WHERE ID = 1;

INSERT INTO Images(Id,ServiceSalonId,Image)
VALUES(1,1,'akvarium nails.jpg');

INSERT INTO Saved(UserId,ServiceSalonId)
VALUES(1,1);

INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
VALUES(1, 1, '08:30', '16:30');

INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
VALUES(1, 2, '08:30', '16:30');

INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
VALUES(1, 3, '08:30', '16:30');

INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
VALUES(1, 4, '08:30', '16:30');

INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
VALUES(1, 5, '08:30', '16:30');

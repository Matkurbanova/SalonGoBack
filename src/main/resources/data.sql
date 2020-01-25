INSERT INTO Category(id,nameCategory,image)
VALUES
(1,'Ногтевой сервис','nails.jpg'),
(2,'Брови','brovi.jpg'),
(3,'Ресницы','resnis.jpg'),
(4,'Макияж','makeUp.jpg'),
(5,'Чистка лица','face.jpg'),
(6,'Шугаринг','epiliatsia.jpg'),
(7,'Лазерная эпиляция','lazernaya epilyatsiya.jpg'),
(8,'Прическа','hair.jpg');



INSERT INTO SubCategory(id,name,CategoryId)
VALUES
(1,'Маникюр',1),
(2,'Педикюр',1),
(3,'Снятие',1),
(4,'Покрытие шеллаком',1),
(5,'Маникюр с покрытием',1),
(6,'Наращивание ногтей',1),
(7,'Дизайн одного ногтя',1),
(8,'Укрепление ногтей',1),
(9,'Гель лак',1),
(10,'Педикюр аппаратный женский Комбинированный',1),
(11,'Педикюр с покрытием',1),
(12,'Удаление вросшего ногтя',1),
(13,'Коррекция бровей',2),
(14,'Окрашивание бровей хной',2),
(15,'Окрашивание бровей краской',2),
(16,'Мейкап бровей',2),
(17,'Окрашивание лечение бровей хной био татуаж',2),
(18,'Патчи под глаза',2),
(19,'Архитектура бровей',2),
(20,'Классическое наращивание',3),
(21,'Объёмное наращивание 2D',3),
(22,'Объёмное наращивание 3D',3),
(23,'Голливудский объем 4 5D',3),
(24,'Мегаобьем 7 10D',3),
(25,'Ламинирование ресниц',3),
(26,'Ламинирование Lash Botox',3),
(27,'Окрашивание ресниц',3),
(28,'Макияж вечерний',4),
(29,'Макияж свадебный',4),
(30,'Фирменный макияж',4),
(31,'Стрелки глаз',4),
(32,'Макияж дневной',4),
(33,'Механическая чистка лица',5),
(34,'Ультрозвуковая чистка лица',5),
(35,'Вакуумная чистка листка',5),
(36,'Химическая чистка лица',5),
(37,'Газожиткостный пилинг',5),
(38,'Лазерная чистка лица',5),
(39,'Ретиноевый пилинг',5),
(40,'Миндальный пилинг',5),
(41,'Салициловой пилинг',5),
(42,'Гликолевый Пилинг',5),
(43,'Мезотерапия лица и тела',5),
(44,'Удаление глубоких морщин',5),
(45,'Увеличение губ',5),
(46,'Ноги полностью',6),
(47,'Ноги до колен',6),
(48,'Подмышки',6),
(49,'Руки полностью',6),
(50,'Руки до локтя',6),
(51,'Лицо',6),
(52,'Усики',6),
(53,'Бикини глубокое',6),
(54,'Лазерная эпиляция рук полностью',7),
(55,'Лазерная эпиляция рук ниже локтей',7),
(56,'Лазерная эпиляция зоны подмышечных впадин',7),
(57,'Лазерная эпиляция ног полностью',7),
(58,'Лазерная эпиляция зоны классического бикини',7),
(59,'Лазерная эпиляция зоны глубокого бикини',7),
(60,'Женская стрижка',8),
(61,'Женская стрижка каре',8),
(62,'Женские стрижка (короткие)',8),
(63,'Женская стрижка (ниже плеч)',8),
(64,'Коррекция чёлки',8),
(65,'Мужская стрижка',8),
(66,'Стрижка наголо',8),
(67,'Укладка мужская',8),
(68,'Детская стрижка',8),
(69,'Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д)',8),
(70,'Окрашивание волос в один тон',8),
(71,'Мелирование',8),
(72,'Тонирование',8),
(73,'Колорирование',8),
(74,'Блондирование',8),
(75,'Декапирование (снятие краски)',8),
(76,'Полировка волос',8),
(77,'Кератиновое выпрямление волос',8),
(78,'Вечерние собранные прически',8),
(79,'Свадебная причёска',8),
(80,'Плетение кос',8),
(81,'Локоны',8),
(82,'Наращивание волос (работа)',8),
(83,'Мойка сушка волос по напрвлению без парфюма',8);








INSERT INTO UserSalon(id,login,name,password,phone,address,description,instaLogin,logoSalon)
VALUES(1,'bermet03','Bermet','123','+996770595959','5-й микрорайон, 63Б
5 м-н, Октябрьский район, Бишкек','Мы всегда рады видеть новых гостей в нашем салоне красоты!
Широкий спектр услуг, отличное качество - по приемлемым ценам.','salon03','imageLogo.png');
INSERT INTO UserSalon(id,login,name,password,phone,address,description,instaLogin,logoSalon)
VALUES(2,'nurzhan05','Nurzhan','1234','+996770595985','5-й микрорайон, 63Б
5 м-н, Октябрьский район, Бишкек','Мы всегда рады видеть новых гостей в нашем салоне красоты!
Широкий спектр услуг, отличное качество - по приемлемым ценам.','arapova.nn','imageLogo.png');



INSERT INTO UserPersonal(id,login,password,phone,name,avatarimages)
VALUES(2,'matber03','bema123','+996555555555','Bermet','avatarUser.png');

INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(1,1,6,'1000 сом','Наращивание ногтей Аквариумный дизайн','akvarium_nails.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(2,1,1,'300 сом','Маникюр с черным лаком','manikur.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(3,1,2,'400 сом','Педикюр','Nailspedikur.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(4,1,3,'200 сом','Снятие','snyatie.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(5,1,4,'600 сом','Покрытие шеллаком','manicure_nails_woman.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(6,1,5,'400 сом','Маникюр с покрытием','manicure_s_pokrytiem.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(7,1,7,'50 сом','Дизайн одного ногтя','dizain_odnogo_nogtya.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(8,1,8,'100 сом','Укрепление ногтей','ukreplenie_nogtei.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(9,1,9,'500 сом','Покрытие гель-лаком','manicure_gel_lak.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(10,1,10,'600 сом','Аппаратный педикюр','apparatnyi_pedicure.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(11,1,11,'600 сом','Педикюр с покрытием','pedicure_s_pokrytiem.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(12,1,12,'300 сом','Коррекция ногтей','korrekrtsiya_nogtei.jpeg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(13,2,13,'400 сом','Коррекция бровей','korrektsiya_brovei.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(14,2,14,'800 сом','Окрашивание бровей с краской','okrashivanie_brovei.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(15,2,15,'700 сом','Окрашивание бровей хной','okrashivanie_brovei_hnoi.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(16,2,16,'300 сом','Мейкап бровей','makeup_brows.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(17,2,17,'600 сом','Окрашивание лечение бровей хной био татуаж','biotatuazh_hnoi.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(18,2,18,'100 сом','Омоложивающий патчи','patchi_pod_glaz.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(19,2,19,'500 сом','Архитектура бровей','architecture_brows.jpeg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(20,1,20,'800 сом','Классическое наращивание','klassik_res.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(21,1,21,'900 сом','Объёмное наращивание 2D','2d_nar_res.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(22,1,22,'1000 сом','Объёмное наращивание 3D','3d_nar_res.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(23,1,23,'1200 сом','Голливудский объем 4 5D','4_5D_nar_res.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(24,1,24,'1300 сом','Мегаобьем 7 10D','megaobem_7_10D.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(25,1,25,'800 сом','Ламинирование ресниц','laminirovanie_resnits.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(26,1,26,'900 сом','Ламинирование Lash Botox','lam_lashbotox.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(27,1,27,'100 сом','Окрашивание ресниц','okrash_resn.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(28,1,28,'800 сом','Модный вечерный макияж','modnyi_vechernie_make.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(29,1,29,'2000 сом','Макияж свадебный','weddingmake.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(30,1,30,'1000 сом','Фирменный макияж','firmennyi_makeUp.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(31,1,31,'800 сом','Стрелки глаз','strelka.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(32,1,32,'500 сом','Макияж дневной','dnevnoi_makeUp.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(33,1,33,'500 сом','Механическая чистка лица','machine_face.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(34,1,34,'500 сом','Ультрозвуковая чистка лица','ultra_chhistka_litsa.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(35,1,35,'500 сом','Вакуумная чистка листка','vacuum_chistka_litsa.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(36,1,36,'500 сом','Химическая чистка лица','himik_face.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(37,1,37,'1000 сом','Газожиткостный пилинг','gaz.piling.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(38,1,8,'1000 сом','Лазерная чистка лица','laz.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(39,1,39,'1300 сом','Ретиноевый пилинг','retin.piling.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(40,1,40,'1000 сом','Миндальный пилинг','mindalinyi_pil.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(41,1,41,'1300 сом','Салициловой пилинг','chemicky peeling1.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(42,1,42,'1500 сом','Гликолевый Пилинг','glikolevyi_piling.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(43,1,43,'1600 сом','Мезотерапия лица и тела','mezo_dlya_litsa.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(44,1,44,'1800 сом','Удаление глубоких морщин','udalenie_ot_morshin.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(45,1,45,'3000 сом','Увеличение губ','uvelichit_gub.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(46,1,46,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(47,1,47,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(48,1,48,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(49,1,49,'700 сом','Ноги до колен','nogi_do_kolen.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(50,1,50,'500 сом','Руки до локтя','do_loktya.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(51,1,51,'700 сом','Лицо','sugaring_face.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(52,1,52,'300 сом','Усики','usiki.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(53,1,53,'500 сом','Бикини глубокое','deep_bikini.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(54,1,54,'3500 сом','Лазерная эпиляция рук полностью','laz_ruk.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(55,1,55,'2600 сом','Лазерная эпиляция рук ниже локтей','laz_logtei.jpg');

INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(56,1,56,'1500 сом','Лазерная эпиляция зоны подмышечных впадин','podmysh_laz.jpeg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(57,1,57,'4500 сом','Лазерная эпиляция ног полностью','laz_ep_nog.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(58,1,58,'5500 сом','Лазерная эпиляция зоны классического бикини','bikini_laz.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(59,1,59,'2600 сом','Лазерная эпиляция зоны глубокого бикини','glubokogo_bikini.jpg');

INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(60,1,60,'350 сом','Женская стрижка','male_str.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(61,1,61,'400 сом','Женская стрижка каре','kare.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(62,1,62,'300 сом','Женские стрижка (короткие)','short_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(63,1,63,'400 сом','Женская стрижка (ниже плеч)','nizhe_plech_strizhka.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(64,1,64,'100 сом','Коррекция чёлки','korreaktsiya_chelki.jpeg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(65,1,65,'200 сом','Мужская стрижка','man_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(66,1,66,'500 сом','Стрижка наголо','nagolo_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(67,1,67,'150 сом','Укладка мужская','ukladka_muzhskaya.jpeg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(68,1,68,'300 сом','Детская стрижка','kind_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(69,1,69,'800 сом','Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д','okr_volos.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(70,1,70,'300 сом','Окрашивание волос в один тон','okr_v_odin_color.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(71,1,71,'550 сом','Мелирование','melirovanie.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(72,1,72,'600 сом','Тонирование','tonirovanie.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(73,1,73,'700 сом','Колорирование','kolonirovanie.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(74,1,74,'800 сом','Блондирование','blondirovanie.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(75,1,75,'400 сом','Декапирование (снятие краски)','delete_color.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(76,1,76,'550 сом','Полировка волос','polirovka_volos.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(77,1,77,'1550 сом','Кератиновое выпрямление волос','keratinov_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(78,1,78,'550 сом','Вечерние собранные прически','party_make_hair.jpg');

VALUES(79,1,79,'1200 сом','Свадебная причёска','wedding_hair.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )

VALUES(80,1,80,'250 сом','Плетение кос','shikarnye-pricheski.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(81,1,81,'500 сом','Локоны','lokony.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(82,1,82,'3000 сом','Наращивание волос (работа)','narash_volos.jpg');
INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image )
VALUES(83,1,83,'200 сом','Мойка сушка волос по напрвлению без парфюма','moika_sushka_volos.jpg');








--UPDATE ServiceSalon SET SalonId = '1' WHERE ID = 1;
--UPDATE ServiceSalon SET SubCategoryId = '1' WHERE ID = 1;

INSERT INTO ImagesSalon(Id,ServiceSalonId,Image)
VALUES(1,1,'akvarium nails.jpg');

INSERT INTO Saved(UserId,ServiceSalonId)
VALUES(2,1);

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

INSERT INTO UserMaster(id,typeStatus,login,name,password,phone,workExperienceYear,ImageMaster,Description,Instagram)
VALUES(1,1,'kamilla@gmail.com','Камилла','12345','+996707556644','5 года','masteravatar.png','Я - мастер ногтегого сервиса. Работаю с 2015 года. Я постоянно учусь,совершенствую свой уровень и качество работ и слежу за последними тенденциями...','arapova.nn');


--INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
--VALUES(1,1,1,'500 сом','Покрытие шеллаком','pokrytie shellakom.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(1,1,6,'1000 сом','Наращивание ногтей Аквариумный дизайн','akvarium_nails.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(2,1,1,'300 сом','Маникюр с черным лаком','manikur.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(3,1,2,'400 сом','Педикюр','Nailspedikur.jpg');
 INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(4,1,3,'200 сом','Снятие','snyatie.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(5,1,4,'600 сом','Покрытие шеллаком','manicure_nails_woman.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(6,1,5,'400 сом','Маникюр с покрытием','manicure_s_pokrytiem.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(7,1,7,'50 сом','Дизайн одного ногтя','dizain_odnogo_nogtya.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(8,1,8,'100 сом','Укрепление ногтей','ukreplenie_nogtei.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(9,1,9,'500 сом','Покрытие гель-лаком','manicure_gel_lak.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(10,1,10,'600 сом','Аппаратный педикюр','apparatnyi_pedicure.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(11,1,11,'600 сом','Педикюр с покрытием','pedicure_s_pokrytiem.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(12,1,12,'300 сом','Коррекция ногтей','korrekrtsiya_nogtei.jpeg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(13,1,13,'400 сом','Коррекция бровей','korrektsiya_brovei.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(14,1,14,'800 сом','Окрашивание бровей с краской','okrashivanie_brovei.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(15,1,15,'700 сом','Окрашивание бровей хной','okrashivanie_brovei_hnoi.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(16,1,16,'300 сом','Мейкап бровей','makeup_brows.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(17,1,17,'600 сом','Окрашивание лечение бровей хной био татуаж','biotatuazh_hnoi.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(18,1,18,'100 сом','Омоложивающий патчи','patchi_pod_glaz.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(19,1,19,'500 сом','Архитектура бровей','architecture_brows.jpeg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(20,1,20,'800 сом','Классическое наращивание','klassik_res.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(21,1,21,'900 сом','Объёмное наращивание 2D','2d_nar_res.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(22,1,22,'1000 сом','Объёмное наращивание 3D','3d_nar_res.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(23,1,23,'1200 сом','Голливудский объем 4 5D','4_5D_nar_res.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(24,1,24,'1300 сом','Мегаобьем 7 10D','megaobem_7_10D.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(25,1,25,'800 сом','Ламинирование ресниц','laminirovanie_resnits.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(26,1,26,'900 сом','Ламинирование Lash Botox','lam_lashbotox.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(27,1,27,'100 сом','Окрашивание ресниц','okrash_resn.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(28,1,28,'800 сом','Модный вечерный макияж','modnyi_vechernie_make.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(29,1,29,'2000 сом','Макияж свадебный','weddingmake.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(30,1,30,'1000 сом','Фирменный макияж','firmennyi_makeUp.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(31,1,31,'800 сом','Стрелки глаз','strelka.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(32,1,32,'500 сом','Макияж дневной','dnevnoi_makeUp.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(33,1,33,'500 сом','Механическая чистка лица','machine_face.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(34,1,34,'500 сом','Ультрозвуковая чистка лица','ultra_chhistka_litsa.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(35,1,35,'500 сом','Вакуумная чистка листка','vacuum_chistka_litsa.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(36,1,36,'500 сом','Химическая чистка лица','himik_face.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(37,1,37,'1000 сом','Газожиткостный пилинг','gaz.piling.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(38,1,8,'1000 сом','Лазерная чистка лица','laz.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(39,1,39,'1300 сом','Ретиноевый пилинг','retin.piling.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(40,1,40,'1000 сом','Миндальный пилинг','mindalinyi_pil.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(41,1,41,'1300 сом','Салициловой пилинг','chemicky peeling1.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(42,1,42,'1500 сом','Гликолевый Пилинг','glikolevyi_piling.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(43,1,43,'1600 сом','Мезотерапия лица и тела','mezo_dlya_litsa.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(44,1,44,'1800 сом','Удаление глубоких морщин','udalenie_ot_morshin.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(45,1,45,'3000 сом','Увеличение губ','uvelichit_gub.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(46,1,46,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(47,1,47,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(48,1,48,'800 сом','Ноги полностью','nogi_polnost.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(49,1,49,'700 сом','Ноги до колен','nogi_do_kolen.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(50,1,50,'500 сом','Руки до локтя','do_loktya.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(51,1,51,'700 сом','Лицо','sugaring_face.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(52,1,52,'300 сом','Усики','usiki.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(53,1,53,'500 сом','Бикини глубокое','deep_bikini.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(54,1,54,'3500 сом','Лазерная эпиляция рук полностью','laz_ruk.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(55,1,55,'2600 сом','Лазерная эпиляция рук ниже локтей','laz_logtei.jpg');

INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(56,1,56,'1500 сом','Лазерная эпиляция зоны подмышечных впадин','podmysh_laz.jpeg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(57,1,57,'4500 сом','Лазерная эпиляция ног полностью','laz_ep_nog.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(58,1,58,'5500 сом','Лазерная эпиляция зоны классического бикини','bikini_laz.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(59,1,59,'2600 сом','Лазерная эпиляция зоны глубокого бикини','glubokogo_bikini.jpg');

INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(60,1,60,'350 сом','Женская стрижка','male_str.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(61,1,61,'400 сом','Женская стрижка каре','kare.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(62,1,62,'300 сом','Женские стрижка (короткие)','short_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(63,1,63,'400 сом','Женская стрижка (ниже плеч)','nizhe_plech_strizhka.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(64,1,64,'100 сом','Коррекция чёлки','korreaktsiya_chelki.jpeg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(65,1,65,'200 сом','Мужская стрижка','man_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(66,1,66,'500 сом','Стрижка наголо','nagolo_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(67,1,67,'150 сом','Укладка мужская','ukladka_muzhskaya.jpeg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(68,1,68,'300 сом','Детская стрижка','kind_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(69,1,69,'800 сом','Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д','okr_volos.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(70,1,70,'300 сом','Окрашивание волос в один тон','okr_v_odin_color.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(71,1,71,'550 сом','Мелирование','melirovanie.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(72,1,72,'600 сом','Тонирование','tonirovanie.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(73,1,73,'700 сом','Колорирование','kolonirovanie.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(74,1,74,'800 сом','Блондирование','blondirovanie.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(75,1,75,'400 сом','Декапирование (снятие краски)','delete_color.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(76,1,76,'550 сом','Полировка волос','polirovka_volos.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(77,1,77,'1550 сом','Кератиновое выпрямление волос','keratinov_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(78,1,78,'550 сом','Вечерние собранные прически','party_make_hair.jpg');

VALUES(79,1,79,'1200 сом','Свадебная причёска','wedding_hair.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)

VALUES(80,1,80,'250 сом','Плетение кос','shikarnye-pricheski.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(81,1,81,'500 сом','Локоны','lokony.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(82,1,82,'3000 сом','Наращивание волос (работа)','narash_volos.jpg');
INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
VALUES(83,1,83,'200 сом','Мойка сушка волос по напрвлению без парфюма','moika_sushka_volos.jpg');

INSERT INTO ImagesMaster(id,ServiceMasterId,Image)
VALUES(1,1,'pokrytie shellakom.jpg');

INSERT INTO Promo(id,SalonId,UserMasterId,newPrice,oldPrice,promoDescription,promoImage)
VALUES(1,1,1,'500сом','400сом','Акция от салона красоты и мастера Камилла. Запись заранее по Вотсап:+996707556644','promoimage.jpeg');
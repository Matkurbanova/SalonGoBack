--INSERT INTO Category(id,nameCategory,image)
--VALUES
--(1,'Ногтевой сервис','nails.jpg'),
--(2,'Брови','brovi.jpg'),
--(3,'Ресницы','resnis.jpg'),
--(4,'Макияж','makeUp.jpg'),
--(5,'Чистка лица','face.jpg'),
--(6,'Шугаринг','epiliatsia.jpg'),
--(7,'Лазерная эпиляция','lazernaya epilyatsiya.jpg'),
--(8,'Прическа','hair.jpg');
--
--
--
--INSERT INTO SubCategory(id,name,CategoryId)
--VALUES
--(1,'Маникюр',1),
--(2,'Педикюр',1),
--(3,'Снятие',1),
--(4,'Покрытие шеллаком',1),
--(5,'Маникюр с покрытием',1),
--(6,'Наращивание ногтей',1),
--(7,'Дизайн одного ногтя',1),
--(8,'Укрепление ногтей',1),
--(9,'Гель лак',1),
--(10,'Педикюр аппаратный женский Комбинированный',1),
--(11,'Педикюр с покрытием',1),
--(12,'Удаление вросшего ногтя',1),
--(13,'Коррекция бровей',2),
--(14,'Окрашивание бровей хной',2),
--(15,'Окрашивание бровей краской',2),
--(16,'Мейкап бровей',2),
--(17,'Окрашивание лечение бровей хной био татуаж',2),
--(18,'Патчи под глаза',2),
--(19,'Архитектура бровей',2),
--(20,'Классическое наращивание',3),
--(21,'Объёмное наращивание 2D',3),
--(22,'Объёмное наращивание 3D',3),
--(23,'Голливудский объем 4 5D',3),
--(24,'Мегаобьем 7 10D',3),
--(25,'Ламинирование ресниц',3),
--(26,'Ламинирование Lash Botox',3),
--(27,'Окрашивание ресниц',3),
--(28,'Макияж вечерний',4),
--(29,'Макияж свадебный',4),
--(30,'Фирменный макияж',4),
--(31,'Стрелки глаз',4),
--(32,'Макияж дневной',4),
--(33,'Механическая чистка лица',5),
--(34,'Ультрозвуковая чистка лица',5),
--(35,'Вакуумная чистка листка',5),
--(36,'Химическая чистка лица',5),
--(37,'Газожиткостный пилинг',5),
--(38,'Лазерная чистка лица',5),
--(39,'Ретиноевый пилинг',5),
--(40,'Миндальный пилинг',5),
--(41,'Салициловой пилинг',5),
--(42,'Гликолевый Пилинг',5),
--(43,'Мезотерапия лица и тела',5),
--(44,'Удаление глубоких морщин',5),
--(45,'Увеличение губ',5),
--(46,'Ноги полностью',6),
--(47,'Ноги до колен',6),
--(48,'Подмышки',6),
--(49,'Руки полностью',6),
--(50,'Руки до локтя',6),
--(51,'Лицо',6),
--(52,'Усики',6),
--(53,'Бикини глубокое',6),
--(54,'Лазерная эпиляция рук полностью',7),
--(55,'Лазерная эпиляция рук ниже локтей',7),
--(56,'Лазерная эпиляция зоны подмышечных впадин',7),
--(57,'Лазерная эпиляция ног полностью',7),
--(58,'Лазерная эпиляция зоны классического бикини',7),
--(59,'Лазерная эпиляция зоны глубокого бикини',7),
--(60,'Женская стрижка',8),
--(61,'Женская стрижка каре',8),
--(62,'Женские стрижка (короткие)',8),
--(63,'Женская стрижка (ниже плеч)',8),
--(64,'Коррекция чёлки',8),
--(65,'Мужская стрижка',8),
--(66,'Стрижка наголо',8),
--(67,'Укладка мужская',8),
--(68,'Детская стрижка',8),
--(69,'Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д)',8),
--(70,'Окрашивание волос в один тон',8),
--(71,'Мелирование',8),
--(72,'Тонирование',8),
--(73,'Колорирование',8),
--(74,'Блондирование',8),
--(75,'Декапирование (снятие краски)',8),
--(76,'Полировка волос',8),
--(77,'Кератиновое выпрямление волос',8),
--(78,'Вечерние собранные прически',8),
--(79,'Свадебная причёска',8),
--(80,'Плетение кос',8),
--(81,'Локоны',8),
--(82,'Наращивание волос (работа)',8),
--(83,'Мойка сушка волос по напрвлению без парфюма',8);
--
--
--
--
--
--
--
--
--INSERT INTO users (id,login,name,password,phone,address,description,instaLogin,image,type)
--VALUES(1,'bermet03','Beauty Studio','123','+996770595959','5-й микрорайон, 63Б
--5 м-н, Октябрьский район, Бишкек','Мы всегда рады видеть новых гостей в нашем салоне красоты!
--Широкий спектр услуг, отличное качество - по приемлемым ценам.','salon03','imageLogo.png',3)
--,(2,'nurzhan05','Nurzhan','1234','+996770595985','5-й микрорайон, 63Б
--5 м-н, Октябрьский район, Бишкек','Мы всегда рады видеть новых гостей в нашем салоне красоты!
--Широкий спектр услуг, отличное качество - по приемлемым ценам.','arapova.nn','imageLogo.png',3);
--
--INSERT INTO users(id,login,password,phone,name,image)
--VALUES(3,'matber03','bema123','+996555555555','Bermet','avatarUser.png');
--
--INSERT INTO users(id,login,name,password,phone,description,instaLogin,image,type)
--VALUES(4,'kamilla@gmail.com','Камилла','12345','+996707556644',
--'Я - мастер ногтегого сервиса. Работаю с 2015 года. Я постоянно учусь,
--совершенствую свой уровень и качество работ и слежу за последними тенденциями...','arapova.nn','masteravatar.png',2);
--
--INSERT INTO ServiceSalon(Id,SalonId,SubCategoryId,Price,Description,Image)
--VALUES
--(1,1,6,'1000 сом','Наращивание ногтей Аквариумный дизайн','akvarium_nails.jpg'),
--(2,1,1,'300 сом','Маникюр с черным лаком','manikur.jpg'),
--(3,1,2,'400 сом','Педикюр','Nailspedikur.jpg'),
--(4,1,3,'200 сом','Снятие','snyatie.jpg'),
--(5,1,4,'600 сом','Покрытие шеллаком','manicure_nails_woman.jpg'),
--(6,1,5,'400 сом','Маникюр с покрытием','manicure_s_pokrytiem.jpg'),
--(7,1,7,'50 сом','Дизайн одного ногтя','dizain_odnogo_nogtya.jpg'),
--(8,1,8,'100 сом','Укрепление ногтей','ukreplenie_nogtei.jpg'),
--(9,1,9,'500 сом','Покрытие гель-лаком','manicure_gel_lak.jpg'),
--(10,1,10,'600 сом','Аппаратный педикюр','apparatnyi_pedicure.jpg'),
--(11,1,11,'600 сом','Педикюр с покрытием','pedicure_s_pokrytiem.jpg'),
--(12,1,12,'300 сом','Коррекция ногтей','korrekrtsiya_nogtei.jpeg'),
--(13,2,13,'400 сом','Коррекция бровей','korrektsiya_brovei.jpg'),
--(14,2,14,'800 сом','Окрашивание бровей с краской','okrashivanie_brovei.jpg'),
--(15,2,15,'700 сом','Окрашивание бровей хной','okrashivanie_brovei_hnoi.jpg'),
--(16,2,16,'300 сом','Мейкап бровей','makeup_brows.jpg'),
--(17,2,17,'600 сом','Окрашивание лечение бровей хной био татуаж','biotatuazh_hnoi.jpg'),
--(18,2,18,'100 сом','Омоложивающий патчи','patchi_pod_glaz.jpg'),
--(19,2,19,'500 сом','Архитектура бровей','architecture_brows.jpeg'),
--(20,1,20,'800 сом','Классическое наращивание','klassik_res.jpg'),
--(21,1,21,'900 сом','Объёмное наращивание 2D','2d_nar_res.jpg'),
--(22,1,22,'1000 сом','Объёмное наращивание 3D','3d_nar_res.jpg'),
--(23,1,23,'1200 сом','Голливудский объем 4 5D','4_5D_nar_res.jpg'),
--(24,1,24,'1300 сом','Мегаобьем 7 10D','megaobem_7_10D.jpg'),
--(25,1,25,'800 сом','Ламинирование ресниц','laminirovanie_resnits.jpg'),
--(26,1,26,'900 сом','Ламинирование Lash Botox','lam_lashbotox.jpg'),
--(27,1,27,'100 сом','Окрашивание ресниц','okrash_resn.jpg'),
--(28,1,28,'800 сом','Модный вечерный макияж','modnyi_vechernie_make.jpg'),
--(29,1,29,'2000 сом','Макияж свадебный','weddingmake.jpg'),
--(30,1,30,'1000 сом','Фирменный макияж','firmennyi_makeUp.jpg'),
--(31,1,31,'800 сом','Стрелки глаз','strelka.jpg'),
--(32,1,32,'500 сом','Макияж дневной','dnevnoi_makeUp.jpg'),
--(33,1,33,'500 сом','Механическая чистка лица','machine_face.jpg'),
--(34,1,34,'500 сом','Ультрозвуковая чистка лица','ultra_chhistka_litsa.jpg'),
--(35,1,35,'500 сом','Вакуумная чистка листка','vacuum_chistka_litsa.jpg'),
--(36,1,36,'500 сом','Химическая чистка лица','himik_face.jpg'),
--(37,1,37,'1000 сом','Газожиткостный пилинг','gaz.piling.jpg'),
--(38,1,38,'1000 сом','Лазерная чистка лица','laz.jpg'),
--(39,1,39,'1300 сом','Ретиноевый пилинг','retin.piling.jpg'),
--(40,1,40,'1000 сом','Миндальный пилинг','mindalinyi_pil.jpg'),
--(41,1,41,'1300 сом','Салициловой пилинг','chemicky peeling1.jpg'),
--(42,1,42,'1500 сом','Гликолевый Пилинг','glikolevyi_piling.jpg'),
--(43,1,43,'1600 сом','Мезотерапия лица и тела','mezo_dlya_litsa.jpg'),
--(44,1,44,'1800 сом','Удаление глубоких морщин','udalenie_ot_morshin.jpg'),
--(45,1,45,'3000 сом','Увеличение губ','uvelichit_gub.jpg'),
--(46,1,46,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(47,1,47,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(48,1,48,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(49,1,49,'700 сом','Ноги до колен','nogi_do_kolen.jpg'),
--(50,1,50,'500 сом','Руки до локтя','do_loktya.jpg'),
--(51,1,51,'700 сом','Лицо','sugaring_face.jpg'),
--(52,1,52,'300 сом','Усики','usiki.jpg'),
--(53,1,53,'500 сом','Бикини глубокое','deep_bikini.jpg'),
--(54,1,54,'3500 сом','Лазерная эпиляция рук полностью','laz_ruk.jpg'),
--(55,1,55,'2600 сом','Лазерная эпиляция рук ниже локтей','laz_logtei.jpg'),
--(56,1,56,'1500 сом','Лазерная эпиляция зоны подмышечных впадин','podmysh_laz.jpeg'),
--(57,1,57,'4500 сом','Лазерная эпиляция ног полностью','laz_ep_nog.jpg'),
--(58,1,58,'5500 сом','Лазерная эпиляция зоны классического бикини','bikini_laz.jpg'),
--(59,1,59,'2600 сом','Лазерная эпиляция зоны глубокого бикини','glubokogo_bikini.jpg'),
--(60,1,60,'350 сом','Женская стрижка','male_str.jpg'),
--(61,1,61,'400 сом','Женская стрижка каре','kare.jpg'),
--(62,1,62,'300 сом','Женские стрижка (короткие)','short_hair.jpg'),
--(63,1,63,'400 сом','Женская стрижка (ниже плеч)','nizhe_plech_strizhka.jpg'),
--(64,1,64,'100 сом','Коррекция чёлки','korreaktsiya_chelki.jpeg'),
--(65,1,65,'200 сом','Мужская стрижка','man_hair.jpg'),
--(66,1,66,'500 сом','Стрижка наголо','nagolo_hair.jpg'),
--(67,1,67,'150 сом','Укладка мужская','ukladka_muzhskaya.jpeg'),
--(68,1,68,'300 сом','Детская стрижка','kind_hair.jpg'),
--(69,1,69,'800 сом','Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д','okr_volos.jpg'),
--(70,1,70,'300 сом','Окрашивание волос в один тон','okr_v_odin_color.jpg'),
--(71,1,71,'550 сом','Мелирование','melirovanie.jpg'),
--(72,1,72,'600 сом','Тонирование','tonirovanie.jpg'),
--(73,1,73,'700 сом','Колорирование','kolonirovanie.jpg'),
--(74,1,74,'800 сом','Блондирование','blondirovanie.jpg'),
--(75,1,75,'400 сом','Декапирование (снятие краски)','delete_color.jpg'),
--(76,1,76,'550 сом','Полировка волос','polirovka_volos.jpg'),
--(77,1,77,'1550 сом','Кератиновое выпрямление волос','keratinov_hair.jpg'),
--(78,1,78,'550 сом','Вечерние собранные прически','party_make_hair.jpg'),
--(79,1,79,'1200 сом','Свадебная причёска','wedding_hair.jpg'),
--(80,1,80,'250 сом','Плетение кос','shikarnye-pricheski.jpg'),
--(81,1,81,'500 сом','Локоны','lokony.jpg'),
--(82,1,82,'3000 сом','Наращивание волос (работа)','narash_volos.jpg'),
--(83,1,83,'200 сом','Мойка сушка волос по напрвлению без парфюма','moika_sushka_volos.jpg');
--
--
--
--
--
--
--
--
--
----UPDATE ServiceSalon SET SalonId = '1' WHERE ID = 1;
----UPDATE ServiceSalon SET SubCategoryId = '1' WHERE ID = 1;
--
--INSERT INTO ImagesSalon(Id,ServiceSalonId,Image)
--VALUES(1,1,'akvarium nails.jpg');
--
--INSERT INTO Saved(UserId,ServiceSalonId)
--VALUES(3,1);
--
--INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
--VALUES(1, 1, '08:30', '16:30');
--
--INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
--VALUES(1, 2, '08:30', '16:30');
--
--INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
--VALUES(1, 3, '08:30', '16:30');
--
--INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
--VALUES(1, 4, '08:30', '16:30');
--
--INSERT INTO WorkTime (SalonId, day,time_begin,time_end)
--VALUES(1, 5, '08:30', '16:30');
--
----INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
----VALUES(1,1,1,'500 сом','Покрытие шеллаком','pokrytie shellakom.jpg');
--INSERT INTO ServiceMaster(Id,UserMasterId,SubCategoryId,Price,Description,Image)
--VALUES
--(1,4,6,'1000 сом','Наращивание ногтей Аквариумный дизайн','akvarium_nails.jpg'),
--(2,4,1,'300 сом','Маникюр с черным лаком','manikur.jpg'),
--(3,4,2,'400 сом','Педикюр','Nailspedikur.jpg'),
--(4,4,3,'200 сом','Снятие','snyatie.jpg'),
--(5,4,4,'600 сом','Покрытие шеллаком','manicure_nails_woman.jpg'),
--(6,4,5,'400 сом','Маникюр с покрытием','manicure_s_pokrytiem.jpg'),
--(7,4,7,'50 сом','Дизайн одного ногтя','dizain_odnogo_nogtya.jpg'),
--(8,4,8,'100 сом','Укрепление ногтей','ukreplenie_nogtei.jpg'),
--(9,4,9,'500 сом','Покрытие гель-лаком','manicure_gel_lak.jpg'),
--(10,4,10,'600 сом','Аппаратный педикюр','apparatnyi_pedicure.jpg'),
--(11,4,11,'600 сом','Педикюр с покрытием','pedicure_s_pokrytiem.jpg'),
--(12,4,12,'300 сом','Коррекция ногтей','korrekrtsiya_nogtei.jpeg'),
--(13,4,13,'400 сом','Коррекция бровей','korrektsiya_brovei.jpg'),
--(14,4,14,'800 сом','Окрашивание бровей с краской','okrashivanie_brovei.jpg'),
--(15,4,15,'700 сом','Окрашивание бровей хной','okrashivanie_brovei_hnoi.jpg'),
--(16,4,16,'300 сом','Мейкап бровей','makeup_brows.jpg'),
--(17,4,17,'600 сом','Окрашивание лечение бровей хной био татуаж','biotatuazh_hnoi.jpg'),
--(18,4,18,'100 сом','Омоложивающий патчи','patchi_pod_glaz.jpg'),
--(19,4,19,'500 сом','Архитектура бровей','architecture_brows.jpeg'),
--(20,4,20,'800 сом','Классическое наращивание','klassik_res.jpg'),
--(21,4,21,'900 сом','Объёмное наращивание 2D','2d_nar_res.jpg'),
--(22,4,22,'1000 сом','Объёмное наращивание 3D','3d_nar_res.jpg'),
--(23,4,23,'1200 сом','Голливудский объем 4 5D','4_5D_nar_res.jpg'),
--(24,4,24,'1300 сом','Мегаобьем 7 10D','megaobem_7_10D.jpg'),
--(25,4,25,'800 сом','Ламинирование ресниц','laminirovanie_resnits.jpg'),
--(26,4,26,'900 сом','Ламинирование Lash Botox','lam_lashbotox.jpg'),
--(27,4,27,'100 сом','Окрашивание ресниц','okrash_resn.jpg'),
--(28,4,28,'800 сом','Модный вечерный макияж','modnyi_vechernie_make.jpg'),
--(29,4,29,'2000 сом','Макияж свадебный','weddingmake.jpg'),
--(30,4,30,'1000 сом','Фирменный макияж','firmennyi_makeUp.jpg'),
--(31,4,31,'800 сом','Стрелки глаз','strelka.jpg'),
--(32,4,32,'500 сом','Макияж дневной','dnevnoi_makeUp.jpg'),
--(33,4,33,'500 сом','Механическая чистка лица','machine_face.jpg'),
--(34,4,34,'500 сом','Ультрозвуковая чистка лица','ultra_chhistka_litsa.jpg'),
--(35,4,35,'500 сом','Вакуумная чистка листка','vacuum_chistka_litsa.jpg'),
--(36,4,36,'500 сом','Химическая чистка лица','himik_face.jpg'),
--(37,4,37,'1000 сом','Газожиткостный пилинг','gaz.piling.jpg'),
--(38,4,8,'1000 сом','Лазерная чистка лица','laz.jpg'),
--(39,4,39,'1300 сом','Ретиноевый пилинг','retin.piling.jpg'),
--(40,4,40,'1000 сом','Миндальный пилинг','mindalinyi_pil.jpg'),
--(41,4,41,'1300 сом','Салициловой пилинг','chemicky peeling1.jpg'),
--(42,4,42,'1500 сом','Гликолевый Пилинг','glikolevyi_piling.jpg'),
--(43,4,43,'1600 сом','Мезотерапия лица и тела','mezo_dlya_litsa.jpg'),
--(44,4,44,'1800 сом','Удаление глубоких морщин','udalenie_ot_morshin.jpg'),
--(45,4,45,'3000 сом','Увеличение губ','uvelichit_gub.jpg'),
--(46,4,46,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(47,4,47,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(48,4,48,'800 сом','Ноги полностью','nogi_polnost.jpg'),
--(49,4,49,'700 сом','Ноги до колен','nogi_do_kolen.jpg'),
--(50,4,50,'500 сом','Руки до локтя','do_loktya.jpg'),
--(51,4,51,'700 сом','Лицо','sugaring_face.jpg'),
--(52,4,52,'300 сом','Усики','usiki.jpg'),
--(53,4,53,'500 сом','Бикини глубокое','deep_bikini.jpg'),
--(54,4,54,'3500 сом','Лазерная эпиляция рук полностью','laz_ruk.jpg'),
--(55,4,55,'2600 сом','Лазерная эпиляция рук ниже локтей','laz_logtei.jpg'),
--(56,4,56,'1500 сом','Лазерная эпиляция зоны подмышечных впадин','podmysh_laz.jpeg'),
--(57,4,57,'4500 сом','Лазерная эпиляция ног полностью','laz_ep_nog.jpg'),
--(58,4,58,'5500 сом','Лазерная эпиляция зоны классического бикини','bikini_laz.jpg'),
--(59,4,59,'2600 сом','Лазерная эпиляция зоны глубокого бикини','glubokogo_bikini.jpg'),
--(60,4,60,'350 сом','Женская стрижка','male_str.jpg'),
--(61,4,61,'400 сом','Женская стрижка каре','kare.jpg'),
--(62,4,62,'300 сом','Женские стрижка (короткие)','short_hair.jpg'),
--(63,4,63,'400 сом','Женская стрижка (ниже плеч)','nizhe_plech_strizhka.jpg'),
--(64,4,64,'100 сом','Коррекция чёлки','korreaktsiya_chelki.jpeg'),
--(65,4,65,'200 сом','Мужская стрижка','man_hair.jpg'),
--(66,4,66,'500 сом','Стрижка наголо','nagolo_hair.jpg'),
--(67,4,67,'150 сом','Укладка мужская','ukladka_muzhskaya.jpeg'),
--(68,4,68,'300 сом','Детская стрижка','kind_hair.jpg'),
--(69,4,69,'800 сом','Сложное окрашивание волос(балаяж,шатуш,омбре,айертач и т.д','okr_volos.jpg'),
--(70,4,70,'300 сом','Окрашивание волос в один тон','okr_v_odin_color.jpg'),
--(71,4,71,'550 сом','Мелирование','melirovanie.jpg'),
--(72,4,72,'600 сом','Тонирование','tonirovanie.jpg'),
--(73,4,73,'700 сом','Колорирование','kolonirovanie.jpg'),
--(74,4,74,'800 сом','Блондирование','blondirovanie.jpg'),
--(75,4,75,'400 сом','Декапирование (снятие краски)','delete_color.jpg'),
--(76,4,76,'550 сом','Полировка волос','polirovka_volos.jpg'),
--(77,4,77,'1550 сом','Кератиновое выпрямление волос','keratinov_hair.jpg'),
--(78,4,78,'550 сом','Вечерние собранные прически','party_make_hair.jpg'),
--(80,4,80,'250 сом','Плетение кос','shikarnye-pricheski.jpg'),
--(79,4,79,'1200 сом','Свадебная причёска','wedding_hair.jpg'),
--(81,4,81,'500 сом','Локоны','lokony.jpg'),
--(82,4,82,'3000 сом','Наращивание волос (работа)','narash_volos.jpg'),
--(83,4,83,'200 сом','Мойка сушка волос по напрвлению без парфюма','moika_sushka_volos.jpg');
--
--INSERT INTO ImagesMaster(id,ServiceMasterId,Image)
--VALUES(1,1,'pokrytie shellakom.jpg');
--
--INSERT INTO Promo(id,UserId,newPrice,oldPrice,promoDescription,promoImage)
--VALUES(1,1,'500сом','400сом','Акция от салона красоты и мастера Камилла. Запись заранее по Вотсап:+996707556644','promoimage.jpeg');
--
---- SELECT ss.*, us.NAME, us.ADDRESS, us.PHONE  FROM ServiceSalon ss
---- JOIN USERSALON us ON ss.SALONID = us.ID
---- WHERE SubcategoryId = 3
--
--
----SELECT sm.*, um.NAME, um.PHONE, um.workExperienceYear,um.ImageMaster,um.Description,um.Instagram,um.typeStatus  FROM ServiceMaster sm
----JOIN USERMASTER um ON sm.USERMASTERID = um.ID
----WHERE SubcategoryId = 1
--
----SELECT ps.*,   FROM Promo ps
----JOIN Promo p ON ps.SALONID = p.ID
--
--
--
--
--04.03.20
--
--select c.* from servicesalon ss
--LEFT JOIN subcategory sc ON sc.Id = ss.SubcategoryId
--LEFT JOIN category c ON c.Id = sc.CategoryId
--WHERE ss.SalonId = 2
--group by c.Id;
--
--select sc.* from servicesalon ss
--LEFT JOIN subcategory sc ON sc.Id = ss.SubcategoryId
--WHERE ss.SalonId = 2 AND sc.CategoryId = 2
--group by sc.Id;
--
--SELECT * FROM servicesalon WHERE SalonId = 2 AND subcategoryId = 13
--
--select c.* from servicemaster sm
--LEFT JOIN subcategory sc ON sc.Id = sm.SubcategoryId
--LEFT JOIN category c ON c.Id = sc.CategoryId
--WHERE sm.UserMasterId = 4
--group by c.Id;
--
--select sc.* from servicemaster sm
--LEFT JOIN subcategory sc ON sc.Id = sm.SubcategoryId
--WHERE sm.UserMasterId = 4 AND sc.CategoryId = 2
--group by sc.Id;
--
--SELECT * FROM servicemaster WHERE UserMasterId = 4 AND subcategoryId = 13
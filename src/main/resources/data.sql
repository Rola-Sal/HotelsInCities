
INSERT INTO location (x, y)
VALUES (90 , 50);

INSERT INTO city (name, location_id)
VALUES ('Nablus', (select id from location where x = 90));

INSERT INTO location (x, y)
VALUES (20 , 100);

INSERT INTO city (name, location_id)
VALUES ('Tulkarem', (select id from location where x = 20 and y = 100));


INSERT INTO location (x, y)
VALUES (85 , 40) ;
INSERT INTO location (x, y)
VALUES(95,35);

INSERT INTO Hotel (name, location_id , city_id )
VALUES ('Relax', (select id from location where x = 85 and y = 40) , (select id from city where name =  'Nablus'));

INSERT INTO Hotel (name, location_id , city_id )
VALUES ('Wow', (select id from location where x = 95 and y = 35) , (select id from city where name =  'Nablus'));


INSERT INTO location (x, y)
VALUES (30 , 70) ;
INSERT INTO location (x, y)
 VALUES(10,90);


INSERT INTO Hotel (name, location_id , city_id )
VALUES ('Tulkarem Hotel', (select id from location where x = 30 and y = 70) , (select id from city where name =  'Tulkarem'));

INSERT INTO Hotel (name, location_id , city_id )
VALUES ('5 Stars', (select id from location where x = 10 and y = 90) , (select id from city where name =  'Tulkarem'));
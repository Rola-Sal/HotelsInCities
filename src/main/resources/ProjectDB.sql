use mydb;

create table location(
id int primary KEY AUTO_INCREMENT,
x double , 
y double
);

create table city(
id int PRIMARY KEY AUTO_INCREMENT,
location_id int,
name varchar(20), 
foreign key(location_id)
references location(id)
);

create table hotel(
id int primary KEY AUTO_INCREMENT,
city_id int,
location_id int,
name varchar(20),
hotel_capacity int,
max_hotel_capacity int, 
FOREIGN KEY (city_id)
REFERENCES city(id),
foreign key(location_id)
references location(id)
);

create table hotels_customer(
id int primary KEY AUTO_INCREMENT,
hotel_id int,
foreign key(hotel_id)
references hotel(id)
);

create table distance(
distance_id int primary KEY AUTO_INCREMENT,
city_id int,
hotel_id int, 
FOREIGN KEY (city_id)
REFERENCES city(id),
FOREIGN KEY (hotel_id)
REFERENCES hotel(id)
);


select * from city;

select * from hotel;

select * from location; 

select * from distance; 

ALTER TABLE hotel
  ADD distanceFromSpecificCity double 
    AFTER location_id;
    
    ALTER TABLE hotel
  DROP COLUMN distanceFromSpecificCity;
  
drop table hotels_customer;

drop table hotel ; 

drop table city ; 

drop table location ; 

select * from hotels_customer;



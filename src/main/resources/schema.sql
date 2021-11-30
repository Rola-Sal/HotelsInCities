
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
hotelCapacity int,
FOREIGN KEY (city_id)
REFERENCES city(id),
foreign key(location_id)
references location(id)
);


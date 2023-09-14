create database Log;

use log;

create table user
(id int primary key auto_increment,
usuario varchar(30),
senha varchar (10));

select * from user;

insert into user (usuario,senha) values ('julia','123');
insert into user (usuario,senha) values ('nini','123');





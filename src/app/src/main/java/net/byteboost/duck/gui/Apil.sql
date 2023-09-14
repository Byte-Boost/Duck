create database Log;

use log;

create table usuario
(id int primary key auto_increment,
usuario varchar(30),
senha varchar (10));

select * from usuario;

insert into usuario (usuario,senha) values ('julia','123');
insert into usuario (usuario,senha) values ('nini','123');





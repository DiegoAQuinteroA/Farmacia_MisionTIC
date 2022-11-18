create database retocinco;
use retocinco;
create table Producto(
nombre varchar(80) not null,
id varchar(15) not null,
temperatura double not null,
valorBase double not null,
constraint Producto_pk primary key(id));

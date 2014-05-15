

drop table if exists Mundial;
create table if not exists Mundial(
	id_piloto int auto_increment primary key,
	nombre_piloto varchar (50),
	nacionalidad varchar(30),
	fecha_nac date,
	puntos_ultima_carrera boolean,
	puntos_totales int,
	observaciones text,
	cod_escuderia int unsigned

);
drop table if exists Escuderia;
create table if not exists Escuderia(
	cod_escuderia int unsigned primary key,
	nombre_escuderia varchar(30),
	presupuesto decimal (10,2),
	fecha_creacion date,

);

insert into Mundial values

(1,'Fernando Alonso Díaz','España','1981-07-29',true,41,'Tercero en el GP de China',1),
(2,'Lewis Carl Davidson Hamilton','Reino Unido','1985-01-07',true,75,'Primero en tres carreras seguidas',2),
(3,'Nico Erik Rosberg','Alemania','1985-06-27',true,79,'Segundo en GP de China',2),
(4,'Sebastian Vettel','Alemania','1987-07-03',true,33,'Quinto en el GP de China',3),
(5,'Niko Hulkemberg','Alemania','1987-08-19',true,36,'Sexto en el GP de China',4),
(6,'Daniel Ricciardo','Australia','1989-07-01',true,24,'Cuarto en el GP de China',3),
(7,'Valteri Bottas','Finlandia','1989-08-28',true,24,'Séptimo en el Gp de China',5),
(8,'Jenson Button','Reino Unido','1980-01-19',false,23,'Undécimo en el GP de China',6),
(9,'Kevin Magnussen','Dinamarca','1991-09-05',false,20,'Decimo tercero en el GP de China',6),
(10,'Sergio Pérez','México','1990-01-26',true,18,'Noveno tercero en el GP de China',4),
(11,'Felipe Massa','Brasil','1981-04-25',false,12,'Décimo quinto  en el GP de China',5),
(12,'Kimi Räïkkönen','Dinamarca','1979-09-17',false,11,'Duodécimo  en el GP de China',1),
(13,'Kevin Magnussen','Dinamarca','1991-09-05',false,20,'Decimo tercero en el GP de China',6);


insert into Escuderia values

(1,'Ferrari',1,12,10000000.56,'1975-07-04'),
(2,'Mercedes',2,3,9000000,'2012-07-04'),
insert into ambito (n_ambito)
values ('Pista Cubierta'),('Aire Libre'),('Ruta / Marcha');

insert into categoria (n_categoria, d_categoria)
values ('Senior','Atletas mayores de 24 años'),
		('Sub10','Atletas menores de 10 años'),
	  	('Sub12','Atletas de 10 y 11 años'),
	   	('Sub14','Atletas de 12 y 13 años'),
	   	('Sub16','Atletas de 14 y 15 años'),
       	('Sub18','Atletas de 16 y 17 años'),
       	('Sub20','Atletas de 18 y 19 años'),
       	('Sub23','Atletas de 20 a 23 años'),
	   	('Máster','Atletas mayores de 35 años');
	   	
insert into competicion (n_competicion, fecha, lugar)
values ('Reunión FAM', '2020-01-04', 'Coslada'), ('II Trofeo Navidad atletismo femenino', '2020-01-04', 'Coslada'),
		('Reunión FAM', '2020-02-02', 'Arganda del Rey'),
		('Cto Madrid absoluto PC', '2020-02-23', 'Gallur'),('Reunión FAM', '2020-03-08','Vallehermoso');
		
insert into especialidad (n_especialidad)
values ('60m'),('100m'),('200m'),('300m'),('400m'),('500m'),('600m'),('800m'),('1000m'),
		('1500m'),('2000m'),('3000m'),('5000m'),('10000m'),('2000m Obst.'),('3000m Obst.'),
        ('20000m'),('60mv (1.067)'),('60mv (0.84)'),('110mv (1.067)'),('100mv (0.84)'),
        ('400mv (0.91)'),('400mv (0.84)'),('Altura'),('Pértiga'),('Longitud'),('Triple Salto'),
        ('Peso (7.260kg)'),('Peso (4kg)'),('Martillo (7.260kg)'),('Martillo (4kg)'),
        ('Disco (2kg)'),('Disco (1kg)'),('Jabalina (800g)'),('Jabalina (600g)'),
        ('Heptatlón'),('Pentatlón'),('Decatlón'),('4x100m'),('4x200m'),('4x400m');
        
insert into sector (n_sector)
values ('Velocidad'),('Medio fondo'),('Fondo'),('Marcha'),
		('Vallas'),('Saltos'),('Lanzamientos'),('Combinadas'),('Relevos');
		
insert into sexo (n_sexo)
values ('Masculino'),('Femenino');

insert into prueba (id_especialidad, id_categoria, id_sector, id_ambito, id_sexo)
values (1,9,1,1,1), (1,9,1,1,2),(2,9,1,1,1),(2,9,1,1,2),
	   (3,9,1,1,1),(3,9,1,1,2),(4,9,1,1,1),(4,9,1,1,2),
       (5,9,1,1,1),(5,9,1,1,2), /*Velocidad PC*/
       (2,9,1,2,1),(2,9,1,2,2), (3,9,1,2,1),(3,9,1,2,2),
       (4,9,1,2,1),(4,9,1,2,2), (5,9,1,2,1),(5,9,1,2,2), /* Velocidad AL*/
       (6,9,2,1,1),(6,9,2,1,2),(7,9,2,1,1),(7,9,2,1,2),
       (8,9,2,1,1),(8,9,2,1,2),(9,9,2,1,1),(9,9,2,1,2),
       (10,9,2,1,1),(10,9,2,1,2), /* Medio fondo PC*/
       (6,9,2,2,1),(6,9,2,2,2),(7,9,2,2,1),(7,9,2,2,2),
       (8,9,2,2,1),(8,9,2,2,2),(9,9,2,2,1),(9,9,2,2,2),
       (10,9,2,2,1),(10,9,2,2,2), /* Medio fondo AL */
	   (11,9,3,1,1), (11,9,3,1,2),(12,9,3,1,1), (12,9,3,1,2),
	   (13,9,3,1,1), (13,9,3,1,2), /* Fondo PC */
       (11,9,3,2,1), (11,9,3,2,2),(12,9,3,2,1), (12,9,3,2,2),
	   (13,9,3,2,1), (13,9,3,2,2),(14,9,3,2,1), (14,9,3,2,2),
       (15,9,3,2,1), (15,9,3,2,2),(16,9,3,2,1), (16,9,3,2,2), /* Fondo AL */
       (13,9,4,1,1), (13,9,4,1,2), /* Marcha PC */
       (13,9,4,2,1), (13,9,4,2,2),(14,9,4,2,1), (14,9,4,2,2),
       (17,9,4,2,1), (17,9,4,2,2), /* Marcha AL */
       (18,9,5,1,1), (19,9,5,1,2), /* Vallas PC */
       (20,9,5,2,1), (21,9,5,2,2),(22,9,5,2,1), (23,9,5,2,2), /* Vallas AL */
	   (24,9,6,1,1), (24,9,6,1,2),(25,9,6,1,1), (25,9,6,1,2),
	   (26,9,6,1,1), (26,9,6,1,2),(27,9,6,1,1), (27,9,6,1,2), /* Saltos PC */
       (24,9,6,2,1), (24,9,6,2,2),(25,9,6,2,1), (25,9,6,2,2),
	   (26,9,6,2,1), (26,9,6,2,2),(27,9,6,2,1), (27,9,6,2,2), /* Saltos AL */
       (28,9,7,1,1), (29,9,7,1,2), /* Lanzamientos PC */
       (28,9,7,2,1), (29,9,7,2,2),(30,9,7,2,1), (31,9,7,2,2),
       (32,9,7,2,1), (33,9,7,2,2),(34,9,7,2,1), (35,9,7,2,2), /* Lanzamientos AL */
       (36,9,8,1,1), (37,9,8,1,2), /* Combinadas PC */
       (38,9,8,2,1), (36,9,8,2,2), /* Combinadas AL */
       (40,9,9,1,1), (40,9,9,1,2),(41,9,9,1,1), (41,9,9,1,2), /* Releveos PC */
       (39,9,9,2,1), (39,9,9,2,2),(41,9,9,2,1), (41,9,9,2,2); /* Relevos AL */
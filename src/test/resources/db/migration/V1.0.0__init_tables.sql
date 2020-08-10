CREATE TABLE ambito (
    id_ambito SERIAL PRIMARY KEY,
    n_ambito varchar(50) NOT NULL
);

CREATE TABLE categoria (
    id_categoria SERIAL PRIMARY KEY,
    n_categoria varchar(50) NOT NULL,
	d_categoria varchar(50)
);

CREATE TABLE competicion (
    id_competicion SERIAL PRIMARY KEY,
	n_competicion varchar(100) NOT NULL,
	fecha date NOT NULL,
    lugar varchar(50) NOT NULL
);

CREATE TABLE especialidad (
    id_especialidad SERIAL PRIMARY KEY,
    n_especialidad varchar(50) NOT NULL
);

CREATE TABLE sector (
    id_sector SERIAL PRIMARY KEY,
    n_sector varchar(50) NOT NULL
);

CREATE TABLE sexo (
    id_sexo SERIAL PRIMARY KEY,
    n_sexo varchar(50) NOT NULL
);

CREATE TABLE atletas (
    id_atleta SERIAL PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    apellidos varchar(100) NOT NULL,
    fecha_nacimiento date NOT NULL,
    ciudad varchar(50) NOT NULL,
    licencia varchar(10),
	telefono varchar(10),
	email varchar(100),
	id_sexo INTEGER REFERENCES sexo(id_sexo),
	id_categoria INTEGER REFERENCES categoria(id_categoria)
);

CREATE TABLE prueba (
    id_prueba SERIAL PRIMARY KEY,
    id_sexo INTEGER REFERENCES sexo(id_sexo),
	id_categoria INTEGER REFERENCES categoria(id_categoria),
	id_ambito INTEGER REFERENCES ambito(id_ambito),
	id_sector INTEGER REFERENCES sector(id_sector),
	id_especialidad INTEGER REFERENCES especialidad(id_especialidad)
);

CREATE TABLE resultados (
    id_resultado SERIAL PRIMARY KEY,
	marca varchar(50) NOT NULL,
	puntos varchar(50) NOT NULL,
    id_atleta INTEGER REFERENCES atletas(id_atleta),
	id_competicion INTEGER REFERENCES competicion(id_competicion),
	id_prueba INTEGER REFERENCES prueba(id_prueba)
);


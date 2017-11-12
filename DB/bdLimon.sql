create schema dieta AUTHORIZATION postgres;
set search_path to dieta;

create table alimento(
    id serial primary key not null,
    nombre varchar NOT NULL,
    calorias integer not null,
    descripcion varchar not null,
    tipo varchar(20) not null,
    tipo_comida varchar not null
);

CREATE TABLE ejercicio(
    id serial PRIMARY key not null,
    nombre varchar NOT NULL,
    calorias_minuto integer not null,
    descripcion varchar not null,
    tipo VARCHAR(20) not NULL,
    imagen varchar not null
);

CREATE TABLE usuario(
    id SERIAL PRIMARY KEY not null,
    nombre VARCHAR(50) not null,
    ap_paterno VARCHAR(50) not null,
    username VARCHAR(50) not null,
    password VARCHAR(50) not null,
    edad INTEGER not null,
    sexo VARCHAR(1) not null,
    peso FLOAT not null,
    estilo_vida varchar(20) not null,
    altura FLOAT not null
);


create table dieta(
    id serial primary key not null,
    id_usuario INTEGER NOT null,
    nombre VARCHAR NOT NULL,
    descripcion TEXT NOT NULL,
    FOREIGN key (id_usuario) REFERENCES usuario(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT
);

create table dieta_alimento(
    id_dieta INTEGER not null,
    id_alimento INTEGER not null,
    tipo_alimento varchar not null,
    FOREIGN key (id_dieta) REFERENCES dieta(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT,
    FOREIGN key (id_alimento) REFERENCES alimento(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT
);

create table dieta_ejercicio(
    id_dieta INTEGER not null,
    id_ejercicio INTEGER not null,
    FOREIGN key (id_dieta) REFERENCES dieta(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT,
    FOREIGN key (id_ejercicio) REFERENCES ejercicio(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT
);

create table log_bd(
    id serial PRIMARY KEY not null,
    id_usuario INTEGER not null,
    accion varchar not null,
    fecha TIMESTAMP default current_timestamp not null,
    FOREIGN key (id_usuario) REFERENCES usuario(id) MATCH full on UPDATE CASCADE on DELETE RESTRICT
);

copy alimento from '/home/fredy/Documentos/ITO/alimentos.csv' with delimiter '|';
copy ejercicio from '/home/fredy/Documentos/ITO/ejercicios.csv' with delimiter '|';
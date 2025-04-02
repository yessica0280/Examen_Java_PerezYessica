create table ninja (
id_ninja int auto_increment primary key,
nombre varchar(50),
rango varchar(50),
aldea varchar(50)
);


create table mision(
id_mision int auto_increment primary key,
descripcion varchar(50),
rango varchar(50),
recompensa varchar(50)
);

create table misionNinja (
id_misionN int auto_increment primary key,
fecha_inicio date not null,
fecha_fin date not null,
id_ninja int not null,
id_mision int not null,
foreign key (id_ninja) references ninja(id_ninja),
foreign key (id_mision) references mision(id_mision)
);

create table habilidades(
nombre varchar(50),
descripcion varchar(50),
id_ninja int not null,
foreign key (id_ninja) references ninja(id_ninja)
);
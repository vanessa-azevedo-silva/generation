Create database  db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

Create table tb_categoria (
id_categoria int auto_increment,
categoria varchar(30),
primary key (id_categoria)
);

Create table  tb_curso(
id_curso int auto_increment,
nome varchar(30),
preco decimal,
carga_horaria int not null,
fk_curso int,
primary key (id_curso),
foreign key(fk_curso) references tb_categoria(id_categoria)
); 

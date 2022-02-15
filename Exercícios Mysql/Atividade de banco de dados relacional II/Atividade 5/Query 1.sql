Create database  db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

Create table tb_categoria (
id_categoria int auto_increment,
tipo varchar(30),
primary key (id_categoria)
);

Create table  tb_produto(
id_produto int auto_increment,
nome varchar(30),
preco decimal,
quantidade varchar(30),
fk_produto int,
primary key (id_produto),
foreign key(fk_produto) references tb_categoria(id_categoria)
); 

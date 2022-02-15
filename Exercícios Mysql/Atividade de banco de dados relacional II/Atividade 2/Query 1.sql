Create database db_pizzaria_legal;

use db_pizzaria_legal;

Create table tb_categoria (
id_categoria int auto_increment,
tipo varchar(30),
tamanho varchar(30),
primary key (id_categoria)
);

Create table  tb_pizza(
id_pizza int auto_increment,
sabores varchar(30),
molhos varchar(30),
preco decimal(10,2),
fk_categoria int,
primary key (id_pizza),
foreign key(fk_categoria) references tb_categoria(id_categoria)
); 

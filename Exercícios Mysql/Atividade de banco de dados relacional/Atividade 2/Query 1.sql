Create database db_ecommerce;

use db_ecommerce;

Create table tb_produtos(
id bigint (3) auto_increment,
nome varchar (30),
preco decimal(10,2),
cor varchar(20),
marca varchar(30),
primary key (id)
);
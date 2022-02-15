Create database db_rh;

use db_rh;
Create table tb_funcionarios(
id bigint (3) auto_increment,
nome varchar (30),
salario decimal(10,2),
idade int,
admissao date,
primary key (id)
);


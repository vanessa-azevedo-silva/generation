Create database db_generation_game_online;

use db_generation_game_online;

Create table tb_classe(
id_classe int auto_increment,
nome varchar(30),
resistencia int,
primary key (id_classe)
);

Create table  tb_personagem(
id_personagem int auto_increment,
ataque int,
defesa int,
nome varchar(30),
fk_classe int,
primary key (id_personagem),
foreign key(fk_classe) references tb_classe(id_classe)
); 

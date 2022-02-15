select *
from tb_personagem
inner join tb_classe on tb_classe.id_classe = tb_personagem.id_personagem
where tb_classe.nome = "arqueiro";
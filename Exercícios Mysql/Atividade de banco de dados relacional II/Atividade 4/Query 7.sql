select *
from tb_produto
inner join tb_categoria on tb_categoria.id_categoria = tb_produto.fk_produto;
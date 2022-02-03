package exerciciosHerancaPolimorfismoCollections;

import java.util.ArrayList;

public class EstoqueLoja2 {

	public static void main(String[] args) {

		EstoqueLoja e1 = new EstoqueLoja("Tênis", "Adidas", 360);     // índice 0
		EstoqueLoja e2 = new EstoqueLoja("Sandália", "Vizzano", 220); // índice 1
		EstoqueLoja e3 = new EstoqueLoja("Sapatilha", "Dakota", 100); // índice 2
		EstoqueLoja e4 = new EstoqueLoja("Scarpin", "Via Marte", 80); // índice 3

		ArrayList<EstoqueLoja> estoque = new ArrayList<>();

		estoque.add(e1); // Armazenando dados da lista
		estoque.add(e2);
		estoque.add(e3);
		estoque.add(e4);
		System.out.println(estoque); // Apresentando a lista de dados

		estoque.remove(0); // Removendo dados da lista
		System.out.println(estoque);

		estoque.set(2, e4); // Atualizando conteúdo da terceira posição(índice 2)
		System.out.println(estoque);

	}

}

package collections;

import java.util.ArrayList;

public class EstoqueLoja2 {

	public static void main(String[] args) {

		Estoque e1 = new Estoque("T�nis", "Adidas", 360);     // �ndice 0
		Estoque e2 = new Estoque("Sand�lia", "Vizzano", 220); // �ndice 1
		Estoque e3 = new Estoque("Sapatilha", "Dakota", 100); // �ndice 2
		Estoque e4 = new Estoque("Scarpin", "Via Marte", 80); // �ndice 3

		ArrayList<Estoque> estoque = new ArrayList<>();

		estoque.add(e1); // Armazenando dados da lista
		estoque.add(e2);
		estoque.add(e3);
		estoque.add(e4);
		System.out.println(estoque); // Apresentando a lista de dados

		estoque.remove(0); // Removendo dados da lista
		System.out.println(estoque);

		estoque.set(2, e4); // Atualizando conte�do da terceira posi��o(�ndice 2)
		System.out.println(estoque);

	}

}

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto avião, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.
 */

package ExerciciosPoo;

public class Aviao {

	// Atributos
	String compania;
	int capacidade;
	boolean voar;

	// Método (executa a ação do objeto)

	public void chegou() {
		this.voar = true;
		System.out.println("Chegou ao destino");
	}

	public void naoChegou() {
		this.voar = false;
		System.out.println("Não chegou ao destino");
	}

	public void status() {
		System.out.println("Avião da compania aérea: " + this.compania);
		System.out.println("Número de passageiros: " + this.capacidade);
	}
}

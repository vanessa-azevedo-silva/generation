/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
 em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
 informa��es deste objeto no console.
 */

package ExerciciosPoo;

public class Aviao {

	// Atributos
	String compania;
	int capacidade;
	boolean voar;

	// M�todo (executa a a��o do objeto)

	public void chegou() {
		this.voar = true;
		System.out.println("Chegou ao destino");
	}

	public void naoChegou() {
		this.voar = false;
		System.out.println("N�o chegou ao destino");
	}

	public void status() {
		System.out.println("Avi�o da compania a�rea: " + this.compania);
		System.out.println("N�mero de passageiros: " + this.capacidade);
	}
}

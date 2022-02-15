/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
*/

package ExerciciosPoo;
public class ProdutoEletronico {

	// Atributos
	String nome, modelo, marca;
	double preco;
	boolean liga;

	// M�todo (executa a a��o do objeto)

	public void ligar() {
		this.liga = true;
		System.out.println("Aparelho na garantia");
	}

	public void desligar() {
		this.liga = false;
		System.out.println("Aparelho fora da garantia");
	}

	public void status() {
		System.out.println("Modelo do produto: " + this.modelo);
		System.out.println("Marca do produto: " + this.marca);
		System.out.println("Pre�o " + this.preco);
	}
}

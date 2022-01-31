/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
*/

package ExerciciosPoo;
public class ProdutoEletronico {

	// Atributos
	String nome, modelo, marca;
	double preco;
	boolean liga;

	// Método (executa a ação do objeto)

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
		System.out.println("Preço " + this.preco);
	}
}

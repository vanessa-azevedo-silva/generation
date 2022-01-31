/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente
 as informações deste objeto no console. */

package ExerciciosPoo;
 

public class Cliente {
	
		// Atributos - considere uma loja de roupas
		String nome;
		int idade,tamanhoRoupa;
		boolean trabalha;
	
		
		// Método (executa a ação do objeto)
		
		
		public void trabalhar() {
			this.trabalha=true;
		}
		
		public void desempregado() {
			this.trabalha=false;
		}
		
		
		public void podecomprar() {
			if(this.trabalha==true)
				System.out.println("Oferecer cartão de crédito da loja");
			else 
				System.out.println("Não oferecer cartão de crédito da loja");
		}
		
		public void status() {
			System.out.println("\nNome do cliente: "+this.nome);
			System.out.println("Idade do cliente: "+this.idade+" anos");
			System.out.println("Qual tamanho usa: "+this.tamanhoRoupa);
			System.out.println("Está trabalhando?  "+this.trabalha);
		}		
}



/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, 
 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente
 as informa��es deste objeto no console. */

package ExerciciosPoo;
 

public class Cliente {
	
		// Atributos - considere uma loja de roupas
		String nome;
		int idade,tamanhoRoupa;
		boolean trabalha;
	
		
		// M�todo (executa a a��o do objeto)
		
		
		public void trabalhar() {
			this.trabalha=true;
		}
		
		public void desempregado() {
			this.trabalha=false;
		}
		
		
		public void podecomprar() {
			if(this.trabalha==true)
				System.out.println("Oferecer cart�o de cr�dito da loja");
			else 
				System.out.println("N�o oferecer cart�o de cr�dito da loja");
		}
		
		public void status() {
			System.out.println("\nNome do cliente: "+this.nome);
			System.out.println("Idade do cliente: "+this.idade+" anos");
			System.out.println("Qual tamanho usa: "+this.tamanhoRoupa);
			System.out.println("Est� trabalhando?  "+this.trabalha);
		}		
}



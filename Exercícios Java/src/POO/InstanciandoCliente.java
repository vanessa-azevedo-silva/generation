package ExerciciosPoo;

public class InstanciandoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();

		cliente1.nome = "Vanessa";
		cliente1.idade = 25;
		cliente1.tamanhoRoupa = 44;
		cliente1.desempregado();
		cliente1.status();
		cliente1.podecomprar();

		Cliente cliente2 = new Cliente();
		cliente2.nome = "Alessandra";
		cliente2.idade = 18;
		cliente2.tamanhoRoupa = 40;
		cliente2.trabalhar();
		cliente2.status();
		cliente2.podecomprar();

	}
}

package ExerciciosPoo;

public class InstanciandoProdutoEletronico {
	public static void main(String[] args) {

		ProdutoEletronico celular = new ProdutoEletronico();

		celular.modelo = "S10";
		celular.marca = "Samsung";
		celular.preco = 2000.00;
		celular.ligar();
		celular.status();

		ProdutoEletronico liquidificador = new ProdutoEletronico();

		liquidificador.modelo = "Philips2000";
		liquidificador.marca = "Philips";
		liquidificador.preco = 520.00;
		liquidificador.desligar();
		liquidificador.status();
	}
}

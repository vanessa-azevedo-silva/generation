package ExerciciosPoo;

public class InstanciandoAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();

		aviao1.capacidade = 360;
		aviao1.compania = "Gol";
		aviao1.chegou();
		aviao1.status();
		
		Aviao aviao2 = new Aviao();
		aviao2.capacidade = 420;
		aviao2.compania = "Azul";
		aviao2.naoChegou();
		aviao2.status();
	}
}

package exerciciosHerancaPolimorfismoCollection;

public class Principal {

	public static void main(String[] args) {
		Preguica preguica = new Preguica();
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();

		preguica.emitirSom();
		cavalo.emitirSom();
		cachorro.emitirSom();

	}

}

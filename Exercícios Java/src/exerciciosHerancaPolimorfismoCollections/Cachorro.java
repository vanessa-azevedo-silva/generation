package exerciciosHerancaPolimorfismoCollections;

public class Cachorro extends Animal {

	private boolean corre;

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	@Override
	public void emitirSom() {
		System.out.println("Au, au, au...");
	}

}

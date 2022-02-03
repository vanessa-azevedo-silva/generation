package exerciciosHerancaPolimorfismoCollections;

public class Cavalo extends Animal {

	private boolean corre;

	public boolean isCorre() { // seria o getCorre
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando...");
	}

}

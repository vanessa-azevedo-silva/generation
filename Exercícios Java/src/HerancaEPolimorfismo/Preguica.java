package HerancaEPolimorfismo;

public class Preguica extends Animal {

	private boolean sobeArvore;

	public boolean isSubir() {
		return sobeArvore;
	}

	public void setSubir(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}

	@Override
	public void emitirSom() {
		System.out.println("Zzzzz...");
	}

}

package collections;

public class Estoque {
	
	private String tipoSapato, marca;
	private int quantidade;
	
	public Estoque(String x, String m, int n) {
		this.tipoSapato=x;
		this.marca=m;
		this.quantidade=n;
		
	}

	public String getTipoSapato() {
		return tipoSapato;
	}

	public void setTipoSapato(String tipoSapato) {
		this.tipoSapato = tipoSapato;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return quantidade;
	}

	public void setTamanho(int tamanho) {
		this.quantidade = tamanho;
	}
	
	public String toString() {
		return "\nTipo: "+this.tipoSapato+ "\nQuantidade em estoque: "+this.quantidade+"\nMarca: "+this.marca+"\n";
	}

}

package ExercíciosJava;

public class Estoque {

	private String pecas;
	private double valor;

	public Estoque(String pecas, double valor) {
		this.pecas = pecas;
		this.valor = valor;

	}

	public String getPecas() {
		return pecas;
	}

	public void setPecas(String pecas) {
		this.pecas = pecas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "[Estoque: " + this.pecas + " | " + this.valor + " reais]";
	}
}

package ExercíciosJava;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {

		ProdutoEletronico pe = new ProdutoEletronico();

		pe.funcionalidade = "Celular";
		pe.marca = "Motorola";
		pe.modelo = "Moto XH";
		pe.sistemaOperacional = "android";
		pe.numeroDeSerie = 87654321;
		pe.ano = 2021;
		pe.processador = 0.30;

		pe.ligar(4.9);
		System.out.println("O aparelho " + pe.modelo + " está ligando em " + pe.processador + "segundos.");

		pe.desligar(3.5);
		System.out.println("O aparelho " + pe.modelo + " está desligando em " + pe.processador + "segundos.");

	}

}

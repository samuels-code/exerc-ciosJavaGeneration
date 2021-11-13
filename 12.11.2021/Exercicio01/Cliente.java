package ExercíciosJava;

public class Cliente {

	String nome;
	String endereço;
	int telefone;
	double saldo;

	void comprar(double valorCompra) {

		saldo -= valorCompra;
	}

	void devolucao(double valorDevolucao) {

		saldo += valorDevolucao;

	}

}

package Exerc�ciosJava;

import java.util.Scanner;

public class ObjetoCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Scanner ler = new Scanner(System.in);

		int opcao;
		double valorCompra, valord;

		System.out.println("Escreva o nome do(a) cliente: ");
		cliente1.nome = ler.next();

		System.out.println("Escreva o saldo do(a) cliente: ");
		cliente1.saldo = ler.nextDouble();

		System.out.println("Escolha uma op��o: \n 1- Compra | 2- Devolu��o ");
		opcao = ler.nextInt();

		if (opcao == 1) {

			System.out.println("Digite o valor da compra: ");
			valorCompra = ler.nextDouble();
			cliente1.comprar(valorCompra);

			System.out.println("Com a compra o cliente ficou com o saldo de R$ " + cliente1.saldo);
		}

		else if (opcao == 2) {

			System.out.println("Digite o valor da devolucao: ");
			valord = ler.nextDouble();
			cliente1.devolucao(valord);

			System.out.println("Com a devolu��o o saldo do cliente ficou R$ " + cliente1.saldo);

		}

		else {
			System.out.println("Digite uma op��o v�lida");
		}

		ler.close();

	}
}

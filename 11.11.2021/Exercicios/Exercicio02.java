package Exerc�ciosJava;

import java.util.Scanner;

public class Exercicio02 {
	public class MatrizesEVetoresExerc�cio02 {

		public static void main(String[] args) {
			Scanner lancamento = new Scanner(System.in);

			double[] valor = new double[10];
			double media = 0, mp = 0, soma = 0;

			for (int l = 0; l < 10; l++) {
				System.out.println("Insira os n�meros: ");
				valor[l] = lancamento.nextDouble();
				soma += valor[l];
				media = soma / 10;

				if (valor[l] > mp) {
					mp = valor[l];
				}

			}
			System.out.println("A m�dia aritm�tica dos lan�amentos �: " + media);
			System.out.println("A maior pontua��o foi de: " + mp);
			lancamento.close();

		}
	}
}
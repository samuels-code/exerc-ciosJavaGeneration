package ExercíciosJava;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[] notas = new double[5];
		double maiorPontuacao = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a pontuação da atividade: ");
			notas[i] = ler.nextDouble();

			if (notas[i] > maiorPontuacao) {
				maiorPontuacao = notas[i];
			}
		}
		System.out.println("A 1ª pontuação é: " + notas[0]);
		System.out.println("A 2ª pontuação é: " + notas[1]);
		System.out.println("A 3ª pontuação é: " + notas[2]);
		System.out.println("A 4ª pontuação é: " + notas[3]);
		System.out.println("A 5ª pontuação é: " + notas[4]);
		System.out.println("A maior pontuação é " + maiorPontuacao);

		ler.close();
	}

}

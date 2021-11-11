package ExemplosJava;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		int i;

		for (i = 0; i < notas.length; i++) {
			System.out.println("Digite a" + ( i=1 ) + "notas do Aluno: ");
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i];
			media = soma / 4;

		}

		System.out.println("A soma das notas: " + soma);
		System.out.println("A média do Aluno: " + media);
		entrada.close();
	}

}

package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double nota1, nota2, nota3, total;
		double p1 = 0.2, p2 = 0.3, p3 = 0.5;

		System.out.println("Escreva sua primeira nota: ");
		nota1 = leia.nextDouble();

		System.out.println("Escreva sua segunda nota: ");
		nota2 = leia.nextDouble();

		System.out.println("Escreva a terceira nota: ");
		nota3 = leia.nextDouble();

		total = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3));

		System.out.println("A sua m�dia � " + total);

		leia.close();
	}

}

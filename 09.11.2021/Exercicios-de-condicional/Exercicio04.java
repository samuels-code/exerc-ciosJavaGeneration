package ExercíciosJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num, raiz, quadrado;

		System.out.println("Digite um número: ");
		num = scan.nextDouble();

		if (num % 2 == 0) {
			System.out.println("Esse número é par");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + "é: " + raiz);
		}

		else {
			System.out.println("Esse número é impar");
			quadrado = Math.pow(num, 2.0);
			System.out.println("O número " + num + " elevado ao quadrado é: " + quadrado);
		}

		scan.close();

	}

}

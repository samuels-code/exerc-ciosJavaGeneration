package ExercíciosJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Digite o 1º número: ");
		num1 = scan.nextInt();

		System.out.println("Digite o 2º número: ");
		num2 = scan.nextInt();

		System.out.println("Digite o 3º número: ");
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O número " + num1 + " é o maior.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O número " + num2 + " é o maior.");
		} else {
			System.out.println("O número " + num3 + " é o maior.");
		}

		scan.close();

	}
}
package Exerc�ciosJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Digite o 1� n�mero: ");
		num1 = scan.nextInt();

		System.out.println("Digite o 2� n�mero: ");
		num2 = scan.nextInt();

		System.out.println("Digite o 3� n�mero: ");
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O n�mero " + num1 + " � o maior.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero " + num2 + " � o maior.");
		} else {
			System.out.println("O n�mero " + num3 + " � o maior.");
		}

		scan.close();

	}
}
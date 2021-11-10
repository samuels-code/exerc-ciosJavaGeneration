package Exerc�ciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Digite o 1� n�mero: ");
		n1 = scan.nextInt();

		System.out.println("Digite o 2� n�mero: ");
		n2 = scan.nextInt();

		System.out.println("Digite o 3� n�mero: ");
		n3 = scan.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente �: \n" + n1 + n2 + n3);
		} else if (n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente �: \n" + n1 + n3 + n2);
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente �: \n" + n2 + n1 + n3);
		} else if (n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente �: \n" + n2 + n3 + n1);
		} else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente �: \n" + n3 + n1 + n2);
		} else {
			System.out.println("A ordem crescente �: \n" + n3 + n2 + n1);
		}

		scan.close();

	}

}

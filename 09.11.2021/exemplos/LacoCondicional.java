package ExemploJavaGeneration;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.println("Digite a Primeira nota: ");
		nota1 = scan.nextDouble();

		System.out.println("Digite a Segunda nota: ");
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media > 6.0) {
			System.out.println("\nAprovado" + "\nM�dia " + media);
		} else if (media >= 3.0 && media < 6.0) {
			System.out.println("\nRecupera��o" + "\nM�dia; " + media);
		} else {
			System.out.println("\nReprovado" + "\nM�dia: " + media);
		}

		scan.close();

	}

}

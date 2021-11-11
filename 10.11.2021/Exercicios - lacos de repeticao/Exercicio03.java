package ExercíciosJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;

		while (idade != -99) {

			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt(0);

			if (idade < 21) {
				menos21 = menos21 + 1;
			} else if (idade > 50) {
				mais50 = mais50 + 1;
			}
			System.out.println("O total de pessoas com menos de 21 anos é: " + menos21);
			System.out.println("O total de pessoas com mais de 50 anos é: " + mais50);
			scan.close();
		}

	}

}

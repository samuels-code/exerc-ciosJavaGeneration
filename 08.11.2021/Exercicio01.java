package ExercíciosJava;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int anos, meses, dias = 0;
		int diasAnos, diasMeses, total;

		diasAnos = 365;
		diasMeses = 30;

		System.out.println("Qual seria a sua idade em anos...");
		System.out.println("Escreva quantos Anos: ");
		anos = scan.nextInt();

		System.out.println("Escreva quantos Meses: ");
		meses = scan.nextInt();
		
		System.out.println("Escreva quantos Dias: ");
		dias= scan.nextInt();

		total = (diasAnos) + (diasMeses) + dias;

		System.out.println("Você viveu: " + total + "dias!");

		scan.close();

	}
}
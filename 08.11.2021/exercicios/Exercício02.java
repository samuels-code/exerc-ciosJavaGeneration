package ExercíciosJava;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dias, meses, anos;

		System.out.println("Qual seria sua Idade em Dias...");
		System.out.println("Escreva quantos Dias: ");
		dias = scan.nextInt();

		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (meses % 30);

		System.out.println("Você tem " + anos + " anos, " + meses + "meses, " + dias + "dias.");

		scan.close();
	}

}

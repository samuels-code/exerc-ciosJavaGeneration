package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int segF, horas, min, seg;

		System.out.println("Qual � o tempo de dura��o do evento em Segundos...");
		System.out.println("Escreva quantos Segundos: ");
		segF = scan.nextInt();

		horas = segF / 3600;
		min = (segF % 3600 / 60);
		seg = (min % 60);

		System.out.println("O evento dura " + horas + " horas," + min + "minutos, " + seg + "segundos.");

		scan.close();
	}

}

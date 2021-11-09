package pastaGeneration;

import java.util.Scanner;

public class EntadaSaida {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Escreva o valor de a: ");
		a = scan.nextInt();
		
		System.out.println("Escreva o valor de b: ");
		b = scan.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de a com b é: " + soma);
		
		scan.close();
	}
}

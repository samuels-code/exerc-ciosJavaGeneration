package Exerc�ciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			int num, i;
			int par = 0, impar = 0;
			
			for (i = 1; i <= 10; i++) {
				System.out.println("Digite um n�mero: ");
				num = scan.nextInt();
				
				if(num % 2 == 0) {
					par = par + 1;
					System.out.println("Esse n�mero � par!");
				}
				else {
					impar = impar + 1;
					System.out.println("Esse n�mero � impar!");
				}
			}
			

	}

}

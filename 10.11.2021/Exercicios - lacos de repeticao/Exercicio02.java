package ExercíciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			int num, i;
			int par = 0, impar = 0;
			
			for (i = 1; i <= 10; i++) {
				System.out.println("Digite um número: ");
				num = scan.nextInt();
				
				if(num % 2 == 0) {
					par = par + 1;
					System.out.println("Esse número é par!");
				}
				else {
					impar = impar + 1;
					System.out.println("Esse número é impar!");
				}
			}
			

	}

}

package ExercíciosJava;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num = -1, soma = 0; 
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;		
			
		} while (num != 0);
		
	    System.out.println("A soma dos número digitados é: " + soma);
	    ler.close();
	}
}

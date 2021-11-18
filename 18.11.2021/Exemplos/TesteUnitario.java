package ExemplosJava;

import java.util.Scanner;

public class TesteUnitario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com dois numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		int resultado = calc.soma(num1, num2);
		
		if(resultado == resultadoEsperado) {
			System.out.println("teste Ok...!");
		}
		else {
			System.out.println("Teste Falhou...!");
		}
	}

}

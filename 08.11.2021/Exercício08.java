package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double custoCarro, porcentDistr = 0.28, porcentImp = 0.45, total1, total2, total3;

		System.out.println("Custo do carro");
		custoCarro = leia.nextDouble();

		total1 = custoCarro * porcentDistr;
		total2 = custoCarro * porcentImp;
		total3 = custoCarro + total1 + total2;

		System.out.println("Custo para o consumidor ser� de R$ " + total3);
		leia.close();
	}
}
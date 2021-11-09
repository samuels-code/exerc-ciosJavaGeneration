package ExercíciosJava;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, c;
		double d, r, s;

		System.out.println("Digite o valor de a: ");
		a = scan.nextInt();

		System.out.println("Digite o valor de b: ");
		b = scan.nextInt();

		System.out.println("Digite o valor de c: ");
		c = scan.nextInt();

		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);

		d = (r + s) / 2;

		System.out.println("O resultado é: " + d);

		scan.close();
	}

}

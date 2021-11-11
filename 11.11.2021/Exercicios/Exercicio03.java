package ExercíciosJava;

import java.util.Scanner;

public class Exercicio03 {
	public class MatrizesEVetoresExercício03 {

		public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);

			int[][] N1 = new int[4][6];
			int[][] N2 = new int[4][6];
			int[][] M1 = new int[4][6];
			int[][] M2 = new int[4][6];

			for (int l = 0; l < 4; l++) {
				for (int c = 0; c < 6; c++) {
					System.out.println("Digite o valor de N1: ");
					N1[l][c] = ler.nextInt();

					System.out.println("Digite o valor de N2: ");
					N2[l][c] = ler.nextInt();

					M1[l][c] = N1[l][c] + N2[l][c];
					M2[l][c] = N1[l][c] - N2[l][c];
				}
			}
			for (int l = 0; l < 4; l++) {
				for (int c = 0; c < 6; c++) {
					System.out.println("A Matriz M1: " + M1[l][c]);
					System.out.println("A Matriz M2: " + M2[l][c]);
				}

			}

			ler.close();

		}
	}
}

package ExercíciosJava;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {

		Estoque camisetas = new Estoque("Camiseta", 25);
		Estoque calcas = new Estoque("Calça", 80);
		Estoque sapatos = new Estoque("Sapato", 95);

		ArrayList<Estoque> estoque = new ArrayList<>();

		estoque.add(camisetas);
		estoque.add(calcas);
		estoque.add(sapatos);

		System.out.println(estoque);

		estoque.remove(2);

		System.out.println(estoque);

		estoque.add(sapatos);

		System.out.println(estoque);
	}
}

package ExemplosJava;

import java.util.ArrayList;
import java.util.List;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - BackEnd - SpringBoot";
		String aula3 = "Bloco III - FrontEnd";
		String aula4 = "Bloco IV - Java Mobile";

		
			List<String> aulas = new ArrayList();
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			aulas.add(aula4);
		
		for(String i : aulas) {
			System.out.println("Aulas: " + i);
	}
			String primeiraAula = aulas.get(0);
	
			System.out.println("A primeira aula é: " + aulas);
	
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula " + (i+1) + " : " + aulas.get(i));
		}
	}
}

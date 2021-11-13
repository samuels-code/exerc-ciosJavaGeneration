package ExercíciosJava;

public class ObjetoPatinete {

	public static void main(String[] args) {

		Patinete pati = new Patinete();

		pati.nome = "Scooter Off-Road TD-Monster";
		pati.marca = "Two Dogs";
		pati.ano = 2018;
		pati.valor = 11.952;
		pati.velocidade = 0;

		pati.andar(45);

		System.out.println("A velocidade do patinete é " + pati.velocidade + " KM/h.");

		pati.Parar(45);

		System.out.println("O patinete parou, a velocidade atual é de " + pati.velocidade + " KM/h.");
	}

}

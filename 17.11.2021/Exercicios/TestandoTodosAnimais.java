package ExercíciosJava;

public class TestandoTodosAnimais {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		dog.setNome("Bob");
		cavalo.setNome("Pé de Pano");
		preguica.setNome("Lucy");

		System.out.println("Nome do cachorro: " + dog.getNome());
		dog.somAnimal();
		dog.correr();
		System.out.println("\n");

		System.out.println("Nome do cavalo: " + cavalo.getNome());
		cavalo.somAnimal();
		cavalo.correr();
		System.out.println("\n");

		System.out.println("Nome do preguiça: " + preguica.getNome());
		preguica.somAnimal();
		preguica.subir();
		System.out.println("\n");
	}
}
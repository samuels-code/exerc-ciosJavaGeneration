package ExemplosJava;

public class Gato implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("Gato miando: miau miau");
	}

	@Override
	public void dormir() {
		System.out.println("Gato...dormindo!");
	}

}

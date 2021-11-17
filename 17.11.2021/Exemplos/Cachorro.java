package ExemplosJava;

public class Cachorro implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Cachorro latindo: auauauau! ");
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro......dormindo!");
	}
	
}

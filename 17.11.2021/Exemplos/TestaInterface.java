package ExemplosJava;

public class TestaInterface {

	public static void main(String[] args) {
	
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		Gato meuGato = new Gato();
		meuGato.dormir();
	}
}

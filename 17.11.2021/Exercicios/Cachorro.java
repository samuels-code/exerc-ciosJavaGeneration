package ExercíciosJava;

public class Cachorro extends Animal02 implements Animal {

	public void somAnimal() {
		System.out.println("O som do cachorro: Au au au");
		
	}

	public void correr() {
		System.out.println("O cachorro está correndo");
		
	}

	public void subir() {
		System.out.println("O cachorro não sobe em árvores");
		
	}
}

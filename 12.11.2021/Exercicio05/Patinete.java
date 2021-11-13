package ExercíciosJava;

public class Patinete {

	String nome;
	String marca;
	int ano;
	int velocidade;
	double valor;

	void andar (int correr) {
		
		velocidade += correr;
		
	}
	
	void Parar (int desacelerar) {
		
		velocidade -= desacelerar;
		
	}
}

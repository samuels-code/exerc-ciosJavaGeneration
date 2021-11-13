package ExercíciosJava;

public class ObjetoAviao {

public static void main(String[] args) {
		
        Aviao aviao1 = new Aviao();
		
		aviao1.agencia = "Latam";
		aviao1.modelo = "Airbus A330";
		aviao1.destino = "Paris";
		aviao1.ano = 2019;
		aviao1.velocidade = 0;
		
		aviao1.voo(360);
		System.out.println("O avião da agencia " + aviao1.agencia);
		System.out.println("Com destino a " + aviao1.destino);
		System.out.println("Decola com a velocidade " + aviao1.velocidade);
		
		aviao1.pouso(268);
		System.out.println("O avião da " + aviao1.agencia + ", está pousando com a velocidade" + aviao1.velocidade);

	}
}

package ExemplosJava;

public class TratamentoErro {

	public static void main(String[] args) {

		int[] vetor = new int[4];
		System.out.println("Antes da Exception!");

		try {
			vetor[4] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Erro Consetado!!!");
		}
	}
}

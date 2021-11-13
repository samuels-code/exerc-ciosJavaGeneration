package ExercíciosJava;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Funcionario trabalhadora = new Funcionario();

		trabalhadora.nome = "Ana";
		trabalhadora.cargo = "Assistente de consultório";
		trabalhadora.horasDeTrabalho = 250;

		trabalhadora.pagamento(220);
		System.out.println("O valor do salário é R$ " + trabalhadora.salario);

		trabalhadora.extra(30);
		System.out.println("O valor extra do salário é R$ " + trabalhadora.salarioExtra);

	}

}

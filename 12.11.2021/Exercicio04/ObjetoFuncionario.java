package Exerc�ciosJava;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Funcionario trabalhadora = new Funcionario();

		trabalhadora.nome = "Ana";
		trabalhadora.cargo = "Assistente de consult�rio";
		trabalhadora.horasDeTrabalho = 250;

		trabalhadora.pagamento(220);
		System.out.println("O valor do sal�rio � R$ " + trabalhadora.salario);

		trabalhadora.extra(30);
		System.out.println("O valor extra do sal�rio � R$ " + trabalhadora.salarioExtra);

	}

}

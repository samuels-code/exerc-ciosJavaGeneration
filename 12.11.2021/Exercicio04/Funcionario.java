package ExercíciosJava;

public class Funcionario {

	String nome;
    String cargo;
    int horasDeTrabalho;
    double salario;
    double salarioExtra;
    
    

    void pagamento (double horas) {
    	salario = horas * 6.82;
    }
    
    void extra (double extras) {
    	salarioExtra = extras * 10.26;
    }
}

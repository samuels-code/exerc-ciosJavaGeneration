package ExemplosJava;

public class TestaTodoMundo {

	public static void main(String[] args) {

		Professor prof1 = new Professor();
		Professor prof2 = new Professor();
		Aluno a1 = new Aluno();
		
		a1.setNome("Samuel");
		a1.setIdade(18);
		a1.setEndereco("Rua João Guimarães Rosa, 233");
		a1.setSemestre("6° semestre");
		a1.setCurso("");
		
		prof1.setNome("Samuel");
		prof1.setIdade(18);
		prof1.setEndereco("Rua João Guimarães Rosa, 233");
		prof1.setDisciplina("");
		prof1.setSalario(1000.00);
		

		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());

		prof2.setNome("Samuel");
		prof2.setIdade(18);
		prof2.setEndereco("Rua João Guimarães Rosa, 233");
		prof2.setDisciplina("");
		prof2.setSalario(1000.00);
		

		System.out.println(prof2.getNome());
		System.out.println(prof2.getIdade());
		System.out.println(prof2.getEndereco());
		System.out.println(prof2.getDisciplina());
		System.out.println(prof2.getSalario());


		
		
	}

}

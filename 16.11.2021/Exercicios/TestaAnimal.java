package ExercíciosJava;

	public class TestaAnimal {

		public static void main(String[] args) {
			
			Cachorro doguinho = new Cachorro();
			Cavalo cav = new Cavalo();
			Preguica preg = new Preguica();
			
			doguinho.setNome("Bob");
			cav.setNome("Haki");
			preg.setNome("Sophie");
			
			doguinho.setIdade(7);
			cav.setIdade(5);
			preg.setIdade(4);
			
			
			System.out.println("O nome do cachorro é " + doguinho.getNome());
			System.out.println("Ele tem " + doguinho.getIdade() + " anos");
			doguinho.somAnimal();
			doguinho.correr();
			
			System.out.println("\nO nome do cavalo é " + cav.getNome());
			System.out.println("Ele tem " + cav.getIdade() + " anos");
			cav.somAnimal();
			cav.correr();
			
			System.out.println("\nO nome da preguiça é " + preg.getNome());
			System.out.println("Ela tem " + preg.getIdade() + " anos");
			preg.somAnimal();
			preg.subir();
			
		}

	}


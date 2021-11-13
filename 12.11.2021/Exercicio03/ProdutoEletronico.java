package ExercíciosJava;

public class ProdutoEletronico {

		String marca;
		String funcionalidade;
		String modelo;
		String sistemaOperacional;
		int ano;
		int numeroDeSerie;
		double processador;

		void ligar(double iniciar) {

			processador = processador / iniciar;

		}

		void desligar(double fecharPrograma) {

			processador = processador * fecharPrograma;

		}
	}

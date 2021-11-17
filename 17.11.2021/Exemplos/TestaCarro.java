package ExemplosJava;

public class TestaCarro {

	public static void main(String[] args) {
		
		Ferrari c = new Ferrari();
		c.nacionalidade = "Itália";
		c.acelerar();
		
		Fusca d = new Fusca();
		d.nacionalidade = "Alemanha";
		d.acelerar();
		
	}
}

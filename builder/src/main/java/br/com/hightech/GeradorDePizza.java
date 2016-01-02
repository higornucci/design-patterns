package br.com.hightech;

public class GeradorDePizza {

	public static Pizza gerar(String nome, TipoDeMolho molho, String recheio, boolean comBordaRecheada,
			boolean comAzeitonasPretas, boolean comCebola, boolean comRequeijao) {
		
		Pizza pizza = new Pizza(nome, molho, recheio, comBordaRecheada);
		if(comAzeitonasPretas) {
			pizza.colocarAzeitonasPretas();
		} else if (comCebola) {
			pizza.colocarCebola();
		} else if (comRequeijao) {
			pizza.colocarRequeijao();
		}
		
		return pizza;
	}

}

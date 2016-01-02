package br.com.hightech;

public class GeradorDePizza {

	public static Pizza gerar(PizzaCustomizadaBuilder geradorDePizzaCustomizada) {
		return geradorDePizzaCustomizada.criar();
	}

}

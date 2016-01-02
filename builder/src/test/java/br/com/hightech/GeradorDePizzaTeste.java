package br.com.hightech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeradorDePizzaTeste {
	
	@Test
	public void deve_construir_uma_pizza_de_calabresa_com_azeitona() throws Exception {
		Adicional azeitonasPretas = new Adicional("Azeitonas Pretas");
		PizzaCustomizadaBuilder geradorDePizzaCustomizada = new PizzaCustomizadaBuilder().chamada("Calabresa").comTipoDeMolho(TipoDeMolho.VERMELHO).semBorda().comAdicionalDe(azeitonasPretas);
		Pizza pizzaDeCalabresaCriada = GeradorDePizza.gerar(geradorDePizzaCustomizada);

		pizzaDeCalabresaCriada.adicionar(azeitonasPretas);

		assertEquals(azeitonasPretas, pizzaDeCalabresaCriada.getAdicionais().get(0));
	}
}

package br.com.hightech;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorDePizzaTeste {
	
	@Test
	public void deve_construir_uma_pizza_de_calabresa_com_azeitona() throws Exception {
		Adicional azeitonasPretas = new Adicional("Azeitonas Pretas");
		
		Pizza pizzaDeCalabresaCriada = new PizzaCustomizadaBuilder().chamada("").chamada("").chamada("Calabresa").comTipoDeMolho(TipoDeMolho.VERMELHO).semBorda().comAdicionalDe(azeitonasPretas).criar();

		assertEquals(azeitonasPretas, pizzaDeCalabresaCriada.getAdicionais().get(0));
	}
	
	@Test
	public void deve_construir_uma_pizza_simples() throws Exception {
		Pizza pizzaSimples = new PizzaSimplesBuilder()
				.chamada("Calabresa Simples")
				.comTipoDeMolho(TipoDeMolho.VERMELHO)
				.recheadaCom("Calabresa e Mussarela")
				.criar();
		
		assertFalse(pizzaSimples.isBordaRecheada());
		assertTrue(pizzaSimples.getAdicionais().isEmpty());
	}
}

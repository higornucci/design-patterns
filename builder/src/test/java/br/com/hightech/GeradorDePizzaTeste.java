package br.com.hightech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeradorDePizzaTeste {

	@Test
	public void deve_construir_uma_pizza_de_calabresa_com_azeitona() throws Exception {
		boolean comBordaRecheada = false;
		boolean comAzeitonasPretas = true;
		boolean comRequeijao = false;
		boolean comCebola = false;
		Pizza pizzaDeCalabresaEsperada = new Pizza("Pizza de Calabesa", TipoDeMolho.VERMELHO, "Calabresa",
				comBordaRecheada);
		pizzaDeCalabresaEsperada.colocarAzeitonasPretas();

		Pizza pizzaDeCalabresaCriada = GeradorDePizza.gerar("Pizza de Calabesa", TipoDeMolho.VERMELHO, "Calabresa",
				comBordaRecheada, comAzeitonasPretas, comCebola, comRequeijao);

		assertEquals(pizzaDeCalabresaEsperada, pizzaDeCalabresaCriada);
	}
}

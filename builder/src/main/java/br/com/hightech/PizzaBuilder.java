package br.com.hightech;

public interface PizzaBuilder {

	PizzaCustomizadaBuilder chamada(String nome);

	PizzaCustomizadaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho);

	PizzaCustomizadaBuilder recheadaCom(String recheio);

	PizzaCustomizadaBuilder semBorda();

	PizzaCustomizadaBuilder comBorda();

	Pizza criar();
}

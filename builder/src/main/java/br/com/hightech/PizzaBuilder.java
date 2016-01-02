package br.com.hightech;

public interface PizzaBuilder {

	PizzaBuilder chamada(String nome);

	PizzaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho);

	PizzaBuilder recheadaCom(String recheio);

	Pizza criar();
}

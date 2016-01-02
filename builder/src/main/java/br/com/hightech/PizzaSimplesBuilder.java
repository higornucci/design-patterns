package br.com.hightech;

import java.util.ArrayList;
import java.util.List;

public class PizzaSimplesBuilder implements PizzaBuilder {

	private String nome;
	private TipoDeMolho tipoDeMolho;
	private String recheio;

	public PizzaBuilder chamada(String nome) {
		this.nome = nome;
		return this;
	}

	public PizzaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho) {
		this.tipoDeMolho = tipoDeMolho;
		return this;
	}

	public PizzaBuilder recheadaCom(String recheio) {
		this.recheio = recheio;
		return this;
	}

	private boolean semBorda() {
		return false;
	}

	private List<Adicional> semAdicionais() {
		return new ArrayList<Adicional>();
	}
	
	public Pizza criar() {
		return new Pizza(nome, tipoDeMolho, recheio, semBorda(), semAdicionais());
	}	
}

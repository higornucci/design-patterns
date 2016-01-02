package br.com.hightech;

import java.util.ArrayList;
import java.util.List;

public class PizzaCustomizadaBuilder implements PizzaBuilder {

	private String nome;
	private TipoDeMolho tipoDeMolho;
	private String recheio;
	private boolean bordaRecheada;
	private List<Adicional> adicionais;
	
	public PizzaCustomizadaBuilder() {
		this.adicionais = new ArrayList<Adicional>();
	}
	
	public PizzaCustomizadaBuilder chamada(String nome) {
		this.nome = nome;
		return this;
	}

	public PizzaCustomizadaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho) {
		this.tipoDeMolho = tipoDeMolho;
		return this;
	}

	public PizzaCustomizadaBuilder recheadaCom(String recheio) {
		this.recheio = recheio;
		return this;
	}

	public PizzaCustomizadaBuilder semBorda() {
		this.bordaRecheada = false;
		return this;
	}
	
	public PizzaCustomizadaBuilder comBorda() {
		this.bordaRecheada = true;
		return this;
	}

	public PizzaCustomizadaBuilder comAdicionalDe(Adicional adicional) {
		this.adicionais.add(adicional);
		return this;
	}

	public Pizza criar() {
		return new Pizza(nome, tipoDeMolho, recheio, bordaRecheada, adicionais);
	}
}

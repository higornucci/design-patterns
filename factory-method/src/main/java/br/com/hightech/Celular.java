package br.com.hightech;

import java.util.ArrayList;
import java.util.List;

public abstract class Celular {
	
	private SistemaOperacional sistemaOperacional;
	private List<Componente> componentes = new ArrayList<Componente>();
	
	public Celular() {
		this.inserirComponentes();
		this.definirSistemaOperacional();
	}
	
	protected void adcionar(Componente componente) {
		componentes.add(componente);
	}
	
	protected void adcionar(SistemaOperacional sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	protected abstract void definirSistemaOperacional();
	protected abstract void inserirComponentes();
}

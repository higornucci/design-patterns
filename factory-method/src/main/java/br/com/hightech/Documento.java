package br.com.hightech;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento {
	
	private List<Topico> topicos = new ArrayList<Topico>();

	public Documento() {
		this.criarTopicos();
	}

	protected List<Topico> getTopicos() {
		return topicos;
	}
	
	protected void adicionar(Topico topico) {
		topicos.add(topico);
	}

	public abstract void criarTopicos();
}

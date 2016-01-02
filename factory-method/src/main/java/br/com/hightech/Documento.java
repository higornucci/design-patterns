package br.com.hightech;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento {
	
	private List<Pagina> paginas = new ArrayList<Pagina>();

	public Documento() {
		this.criarPaginas();
	}

	protected List<Pagina> getPaginas() {
		return paginas;
	}

	public abstract void criarPaginas();
}

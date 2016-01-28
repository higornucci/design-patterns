package br.com.htcursos;

import java.util.List;

public class FiltroDaBusca {
	
	private OrdenacaoStrategy ordenacaoStrategy;
	
	public void ordenar(List<String> produtos) {
		ordenacaoStrategy.ordenar(produtos);
	}
}

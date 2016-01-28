package br.com.htcursos;

import java.util.List;

public interface OrdenacaoStrategy {
	public abstract void ordenar(List<String> produtos);
}

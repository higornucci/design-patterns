package br.com.htcursos;

import java.util.List;

public class OrdenadorPorMenorValor implements OrdenacaoStrategy {

	public void ordenar(List<String> produtos) {
		System.out.println("Ordenando por menor valor");
	}

}

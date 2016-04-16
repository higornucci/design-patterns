package br.com.htcursos.linha;

import br.com.htcursos.forma.FormaGeometrica;

public class Linha implements FormaGeometrica {
	private LinhaLegada adaptado = new LinhaLegada();

	public void desenhar(int pontoInicialEixoX, int pontoInicialEixoY, int pontoFinalEixoX, int pontoFinalEixoY) {
		adaptado.print(pontoInicialEixoX, pontoFinalEixoX, pontoFinalEixoY, pontoInicialEixoY);
	}

}

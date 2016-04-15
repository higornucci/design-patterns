package br.com.htcursos.linha;

import br.com.htcursos.forma.FormaGeometrica;

public class Linha implements FormaGeometrica {

	LinhaLegada adapter = new LinhaLegada();
	public void desenhar(int pontoInicialEixoX, int pontoInicialEixoY, int pontoFinalEixoX, int pontoFinalEixoY) {
		adapter.desenhar(pontoInicialEixoX, pontoInicialEixoY, pontoFinalEixoX, pontoFinalEixoY);
	}

}

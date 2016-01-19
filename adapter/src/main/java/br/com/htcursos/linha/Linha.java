package br.com.htcursos.linha;

import br.com.htcursos.forma.FormaGeometrica;

public class Linha implements FormaGeometrica {

	LinhaLegada adapter = new LinhaLegada();
	public void desenhar(int x1, int y1, int x2, int y2) {
		adapter.desenhar(x1, y1, x2, y2);
	}

}

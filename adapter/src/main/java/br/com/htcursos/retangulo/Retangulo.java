package br.com.htcursos.retangulo;

import br.com.htcursos.forma.FormaGeometrica;

public class Retangulo implements FormaGeometrica {

	private RetanguloLegado adapter = new RetanguloLegado();

	public void desenhar(int x1, int y1, int x2, int y2) {
		adapter.desenhar(x1, y1, x2, y2);
	}

}

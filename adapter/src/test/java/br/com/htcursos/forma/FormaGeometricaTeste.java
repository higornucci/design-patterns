package br.com.htcursos.forma;

import org.junit.Test;

import br.com.htcursos.linha.Linha;
import br.com.htcursos.retangulo.Retangulo;

public class FormaGeometricaTeste {

	@Test
	public void deve_desenhar_uma_linha() throws Exception {
		FormaGeometrica[] formasGeometricas = { new Linha(), new Retangulo() };

		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < formasGeometricas.length; ++i)
			formasGeometricas[i].desenhar(x1, y1, x2, y2);
	}
}

package br.com.htcursos.retangulo;

import br.com.htcursos.forma.FormaGeometrica;

public class Retangulo implements FormaGeometrica {

	private RetanguloLegado adapter = new RetanguloLegado();

	public void desenhar(int pontoInicialEixoX, int pontoInicialEixoY, int largura, int altura) {
		adapter.print(pontoInicialEixoX, pontoInicialEixoY, largura, altura);
	}

}

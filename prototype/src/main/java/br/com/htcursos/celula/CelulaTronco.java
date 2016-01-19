package br.com.htcursos.celula;

public class CelulaTronco implements Celula {

	public Celula clone() {
		return new CelulaTronco();
	}

	public String funcao() {
		return "Minha função é criar novas celulas.";
	}
	
}
package br.com.htcursos;

public class LetraZ extends Letra {

	public LetraZ() {
		this.simbolo = 'Z';
		this.largura = 100;
		this.altura = 100;
		this.ascendente = 68;
		this.descendete = 0;
	}

	@Override
	public void mostrar(int tamanhoDoPonto) {
		this.tamanhoDoPonto = tamanhoDoPonto;
		System.out.println(this.simbolo + " (pointsize " + this.tamanhoDoPonto + ")");
	}

}

package br.com.htcursos;

public class LetraB extends Letra {

	public LetraB() {
		this.simbolo = 'B';
		this.largura = 100;
		this.altura = 140;
		this.ascendente = 72;
		this.descendete = 0;
	}

	@Override
	public void mostrar(int tamanhoDoPonto) {
		this.tamanhoDoPonto = tamanhoDoPonto;
		System.out.println(this.simbolo + " (pointsize " + this.tamanhoDoPonto + ")");
	}

}

package br.com.htcursos;

public class LetraA extends Letra {

	public LetraA() {
		this.simbolo = 'A';
		this.largura = 100;
		this.altura = 120;
		this.ascendente = 70;
		this.descendete = 0;
	}

	@Override
	public void mostrar(int tamanhoDoPonto) {
		this.tamanhoDoPonto = tamanhoDoPonto;
		System.out.println(this.simbolo + " (pointsize " + this.tamanhoDoPonto + ")");
	}

}

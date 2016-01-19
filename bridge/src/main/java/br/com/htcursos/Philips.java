package br.com.htcursos;

public class Philips implements ControleImbutido {

	public void ligar() {
		System.out.println("Ligou a tv da Philips!!");
	}

	public void desligar() {
		System.out.println("Desligou a tv da Philips!!");
	}

	public void trocarParaOCanal(int canal) {
		System.out.println("Troucou para o canal " + canal + " na tv da Philips!!");
	}

}

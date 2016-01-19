package br.com.htcursos;

public class Sony implements ControleImbutido{

	public void ligar() {
		System.out.println("Ligou a tv da Sony!!");
	}

	public void desligar() {
		System.out.println("Desligou a tv da Sony!!");
	}

	public void trocarParaOCanal(int canal) {
		System.out.println("Troucou para o canal " + canal + " na tv da Sony!!");
	}

}

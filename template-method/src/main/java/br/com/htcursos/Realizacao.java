package br.com.htcursos;

public class Realizacao extends Generalizacao {

	@Override
	protected void segundoPasso() {
		System.out.println("Segundo Passo.");
	}

	@Override
	protected void terceiroPasso() {
		System.out.println("Terceiro Passo.");
	}

}

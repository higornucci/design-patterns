package br.com.htcursos;

abstract class Generalizacao {
	public void resolver() {
		primeiroPasso();
		segundoPasso();
		terceiroPasso();
		quartoPasso();
	}

	protected void primeiroPasso() {
		System.out.println("Primeiro Passo.");
	}

	abstract protected void segundoPasso();

	abstract protected void terceiroPasso();

	protected void quartoPasso() {
		System.out.println("Quarto Passo.");
	}
}

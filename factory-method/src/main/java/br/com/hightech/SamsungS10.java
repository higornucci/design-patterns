package br.com.hightech;

public class SamsungS10 extends Celular {

	@Override
	protected void definirSistemaOperacional() {
		this.adcionar(new AndroidModificado());
	}

	@Override
	protected void inserirComponentes() {
		this.adcionar(new Bateria());
		this.adcionar(new Botoes());
	}

}

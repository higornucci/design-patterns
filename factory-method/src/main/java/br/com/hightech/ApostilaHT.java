package br.com.hightech;

public class ApostilaHT extends Documento {

	@Override
	public void criarTopicos() {
		this.adicionar(new Sumario());
		this.adicionar(new Capitulo());
		this.adicionar(new Conclusao());
	}

}

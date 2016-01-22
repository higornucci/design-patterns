package br.com.htcursos;

public class Doc implements Arquivo {
	private String nome;

	public Doc(String nome) {
		this.nome = nome;
	}

	public void exibirDiretorio() {
		System.out.println(CompositeDemo.identacao + nome);
	}
}

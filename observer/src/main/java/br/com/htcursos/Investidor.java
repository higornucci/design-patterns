package br.com.htcursos;

public class Investidor implements IInvestidor {
	
	private String nome;

	public Investidor(String nome) {
		this.nome = nome;
	}

	public void atualizar() {
		System.out.println("O investidor " + this.nome + " foi avisado da mudança.");
	}
}

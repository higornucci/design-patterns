package br.com.htcursos;

public class Memento {
	private final Solicitacao solicitacao;

	public Memento(Solicitacao solicitacao) {
		Solicitacao solicitacaoASerSalva = new Solicitacao(solicitacao.getEstado());
		this.solicitacao = solicitacaoASerSalva;
	}

	public Solicitacao getSolicitacaoSalva() {
		return solicitacao;
	}
}

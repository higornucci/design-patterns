package br.com.htcursos;

public class Solicitacao {
	private Status estado;

    public Solicitacao(Status estado) {
        this.estado = estado;
    }

    public void enviarParaAnalise() {
		this.estado = Status.EM_ANALISE;
		imprimirEstadoAtual();
	}

	public void reprovar() {
		this.estado = Status.REPROVADO;
		imprimirEstadoAtual();
	}

	public void aprovar() {
		this.estado = Status.APROVADO;
		imprimirEstadoAtual();
	}

	private void imprimirEstadoAtual() {
		System.out.println("Solicitacao: Colocando o estado em " + estado);
	}

    public Status getEstado() {
        return estado;
    }

    public void salvarNoMemento(Caretaker caretaker) {
		System.out.println("Solicitacao: Salvando no Memento.");
		caretaker.adicionar(new Memento(this));
	}

	public void restaurarDoMemento(Memento memento) {
		estado = memento.getSolicitacaoSalva().getEstado();
		System.out.println("Solicitacao: Estado depois de restaurado do Memento: " + estado);
	}
}

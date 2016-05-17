package br.com.htcursos;

public class AlteraStatusDaSolicitacao {

    private Solicitacao solicitacao;
    private Caretaker caretaker;

    public AlteraStatusDaSolicitacao(Solicitacao solicitacao, Caretaker caretaker) {
        this.solicitacao = solicitacao;
        this.caretaker = caretaker;
    }

    public void enviarParaAnalise() {
        solicitacao.enviarParaAnalise();
        solicitacao.salvarNoMemento(caretaker);
    }

    public void aprovar() {
        solicitacao.aprovar();
        solicitacao.salvarNoMemento(caretaker);
    }

    public void reprovar() {
        solicitacao.reprovar();
        solicitacao.salvarNoMemento(caretaker);
    }
}

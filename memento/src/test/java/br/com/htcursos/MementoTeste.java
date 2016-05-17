package br.com.htcursos;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MementoTeste {

    @Test
    public void deve_voltar_a_solicitacao_para_o_estado_anterior(){
        int estadoAtual = 0;
        Caretaker caretaker = new Caretaker();
        Solicitacao solicitacao = new Solicitacao(Status.EM_ANALISE);

        AlteraStatusDaSolicitacao alteraStatus = new AlteraStatusDaSolicitacao(solicitacao, caretaker);
        alteraStatus.aprovar();
        estadoAtual++;
        alteraStatus.enviarParaAnalise();
        estadoAtual++;
        alteraStatus.reprovar();
        estadoAtual++;

        solicitacao.restaurarDoMemento(caretaker.getMemento(--estadoAtual));
        solicitacao.restaurarDoMemento(caretaker.getMemento(--estadoAtual));

        assertThat(solicitacao.getEstado(), is(equalTo(Status.APROVADO)) );
    }

}

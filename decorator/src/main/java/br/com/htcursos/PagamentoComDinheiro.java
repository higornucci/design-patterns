package br.com.htcursos;



public class PagamentoComDinheiro extends Pagamento {


    private Conta conta;

    public PagamentoComDinheiro(Conta conta) {
        this.conta = conta;
    }

    public void pagar() {
        this.conta.pagar();
    }

    double getValorASerPago() {
        return conta.getValor();
    }
}

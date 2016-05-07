package br.com.htcursos;


public class PagamentoDividido extends PagamentoDecorator{

    public PagamentoDividido(Pagamento pagamento) {
        super(pagamento);
    }

    public void pagarDivididoEntre(String... clientes) {

       int quatidadeClientes = clientes.length;
       double valorASerPago = pagamento.getValorASerPago();
       pagar();
        System.out.println("Conta dividida  entre " +quatidadeClientes+ " clientes, ficando " + valorASerPago/quatidadeClientes + " a ser pago por cada um.");
    }

    public void pagar() {
        pagamento.pagar();
    }

    double getValorASerPago() {
        return pagamento.getValorASerPago();
    }
}

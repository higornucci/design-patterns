package br.com.htcursos;

public class AguardandoPagamento extends State {

	public AguardandoPagamento(Compra compra) {
		super(compra);
	}

	@Override
	public void pagar() {
		compra.setStatusDaCompra(StatusDaCompra.PAGAMENTO_APROVADO);
		compra.setState(new PagamentoAprovado(compra));
	}
}

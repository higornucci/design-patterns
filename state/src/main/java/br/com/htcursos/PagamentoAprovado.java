package br.com.htcursos;

public class PagamentoAprovado extends State {

	public PagamentoAprovado(Compra compra) {
		super(compra);
	}
	
	@Override
	protected void enviar() {
		compra.setStatusDaCompra(StatusDaCompra.ENVIADO);
		compra.setState(new Enviado(compra));
	}

}

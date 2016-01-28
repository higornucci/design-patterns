package br.com.htcursos;

public class Enviado extends State {

	public Enviado(Compra compra) {
		super(compra);
	}
	
	@Override
	protected void finalizar() {
		compra.setStatusDaCompra(StatusDaCompra.ENTREGUE);
		compra.setState(new Entregue(compra));
	}

}

package br.com.htcursos;

public class Compra {
	private State state;
	
	private StatusDaCompra statusDaCompra;
	
	private double valor;
	
	private String cliente;

	public Compra(double valor, String cliente) {
		statusDaCompra = StatusDaCompra.AGUARDANDO_PAGAMENTO;
		this.state = new AguardandoPagamento(this);
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public void pagar() {
		state.pagar();
	}
	
	public void enviar() {
		state.enviar();
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getValor() {
		return valor;
	}
	
	public StatusDaCompra getStatusDaCompra() {
		return statusDaCompra;
	}
	
	public void setStatusDaCompra(StatusDaCompra statusDaCompra) {
		this.statusDaCompra = statusDaCompra;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}

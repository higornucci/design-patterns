package br.com.htcursos;

public abstract class State {
	protected Compra compra;
	
	public State(Compra compra) {
		this.compra = compra;
	}
	
	protected void pagar() {
		new UnsupportedOperationException();
	}
	protected void enviar() {
		new UnsupportedOperationException();
	}
	protected void finalizar() {
		new UnsupportedOperationException();
	}
}

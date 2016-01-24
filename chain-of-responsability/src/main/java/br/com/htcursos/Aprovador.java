package br.com.htcursos;

public abstract class Aprovador {
	
	protected Aprovador sucessor;
	
	public void adicionarSucessor(Aprovador sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void verificar(Compra compra);
}

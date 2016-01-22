package br.com.htcursos;

public abstract class ItemDaBiblioteca {
	protected int numeroDeCopias;
	
	public int getNumeroDeCopias() {
		return numeroDeCopias;
	}
	
	public void setNumeroDeCopias(int numeroDeCopias) {
		this.numeroDeCopias = numeroDeCopias;
	}
	 
    public abstract void mostrar();
}

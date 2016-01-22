package br.com.htcursos;

public abstract class Decorator extends ItemDaBiblioteca {
	protected ItemDaBiblioteca itemDaBiblioteca;

	public Decorator(ItemDaBiblioteca itemDaBiblioteca) {
		this.itemDaBiblioteca = itemDaBiblioteca;
	}

	@Override
	public void mostrar() {
		itemDaBiblioteca.mostrar();
	}
}

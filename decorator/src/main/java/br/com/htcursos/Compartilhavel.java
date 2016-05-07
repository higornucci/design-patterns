package br.com.htcursos;

import java.util.ArrayList;
import java.util.List;

public class Compartilhavel extends Decorator {
	protected List<String> pessoasComQuemCompartilhei = new ArrayList<String>();

	public Compartilhavel(ItemDaBiblioteca itemDaBiblioteca) {
		super(itemDaBiblioteca);
	}

	public void compartilharCom(String nome) {
		pessoasComQuemCompartilhei.add(nome);
		itemDaBiblioteca.numeroDeCopias--;
	}

	public void devolver(String nome) {
		pessoasComQuemCompartilhei.remove(nome);
		itemDaBiblioteca.numeroDeCopias++;
	}

	@Override
	public int getNumeroDeCopias() {
		return itemDaBiblioteca.numeroDeCopias;
	}

	@Override
	public void mostrar() {
		itemDaBiblioteca.mostrar();

		for (String compartilhador : pessoasComQuemCompartilhei) {
			System.out.println(" pessoa com quem compartilhei: " + compartilhador);
		}
	}
}

package br.com.htcursos;

import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> estadosSalvos = new ArrayList<Memento>();

	public void adicionar(Memento memento) {
		estadosSalvos.add(memento);
	}

	public Memento getMemento(int indice) {
		return estadosSalvos.get(indice);
	}
}

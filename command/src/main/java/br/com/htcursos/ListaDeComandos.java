package br.com.htcursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeComandos {

	private List<Comando> fila = new ArrayList<Comando>();

	public void adicionar(Comando comando) {
		fila.add(comando);
	}

	public void remover(Comando comando) {
		fila.remove(comando);
	}

	public void trabalhar() {
		for (Comando comando : fila) {
			comando.executar();
		}
		fila.clear();
	}
}

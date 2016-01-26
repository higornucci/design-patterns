package br.com.htcursos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {
	public static List<Comando> criar() {
		List<Comando> fila = new ArrayList<Comando>();
		fila.add(new Encanador());
		fila.add(new Politico());
		fila.add(new Designer());
		return fila;
	}

	public static void trabalhar(List<Comando> fila) {
		for (Comando comando : fila) {
			comando.executar();
		}
	}
}

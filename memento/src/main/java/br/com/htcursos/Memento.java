package br.com.htcursos;

public class Memento {
	private String estado;

	public Memento(String estadoASerSalvo) {
		estado = estadoASerSalvo;
	}

	public String getEstadoSalvo() {
		return estado;
	}
}

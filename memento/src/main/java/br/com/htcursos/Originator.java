package br.com.htcursos;

public class Originator {
	private String estado;

	public void setEstado(String estado) {
		System.out.println("Originator: Colocando o estado em " + estado);
		this.estado = estado;
	}

	public Memento salvarNoMemento() {
		System.out.println("Originator: Salvando no Memento.");
		return new Memento(estado);
	}

	public void restaurarDoMemento(Memento memento) {
		estado = memento.getEstadoSalvo();
		System.out.println("Originator: Estado depois de restaurado do Memento: " + estado);
	}
}

package br.com.htcursos;

public class Filme extends ItemDaBiblioteca {

	private String diretor;
	private String titulo;
	private int duracao;

	public Filme(String diretor, String titulo, int numeroDeCopias, int duracao) {
		this.diretor = diretor;
		this.titulo = titulo;
		this.setNumeroDeCopias(numeroDeCopias);
		this.duracao = duracao;
	}

	@Override
	public void mostrar() {
		System.out.println("Filme ----- ");
		System.out.println(" Diretor: " + diretor);
		System.out.println(" Titulo: " + titulo);
		System.out.println(" # Cópias: " + this.getNumeroDeCopias());
		System.out.println(" Duração: " + duracao);
	}

}

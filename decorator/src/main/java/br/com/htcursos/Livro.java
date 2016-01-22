package br.com.htcursos;

public class Livro extends ItemDaBiblioteca {

	private String autor;
	private String titulo;

	public Livro(String autor, String titulo, int numeroDeCopias) {
		this.autor = autor;
		this.titulo = titulo;
		this.setNumeroDeCopias(numeroDeCopias);
	}

	@Override
	public void mostrar() {
		System.out.println("Livro ------ ");
		System.out.println(" Author: " + autor);
		System.out.println(" Titulo: " + titulo);
		System.out.println(" # Cópias: " + this.getNumeroDeCopias());
	}
}

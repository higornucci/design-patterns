package br.com.hightech;

public class CurriculumVitae extends Documento {

	@Override
	public void criarPaginas() {
		this.getPaginas().add(new Formacao());
		this.getPaginas().add(new Habilidades());
		this.getPaginas().add(new Experiencia());
	}
}

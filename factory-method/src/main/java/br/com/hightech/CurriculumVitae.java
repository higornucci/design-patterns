package br.com.hightech;

public class CurriculumVitae extends Documento {

	@Override
	public void criarTopicos() {
		this.adicionar(new Experiencia());
		this.adicionar(new Formacao());
		this.adicionar(new Habilidades());
	}
}

package br.com.htcursos.presidente;

public final class Presidente {

	private static final Presidente PRESIDENTE = new Presidente();
	private String nome;
	
	private Presidente() {
	}

	public static Presidente getInstance() {
		if(PRESIDENTE == null) {
			return new Presidente();
		} else {
			return PRESIDENTE;
		}
	}

	public void definir(String presidente) {
		this.nome = presidente;
	}

	public String getNome() {
		return this.nome;
	}
	
}

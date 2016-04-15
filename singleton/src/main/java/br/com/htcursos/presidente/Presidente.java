package br.com.htcursos.presidente;

public final class Presidente {

	private static Presidente PRESIDENTE;
	private String nome;
	
	private Presidente() {
	}

	public static Presidente getInstance() {
		if(PRESIDENTE == null) 
			PRESIDENTE = new Presidente();
		return PRESIDENTE;
	}

	public void definir(String presidente) {
		this.nome = presidente;
	}

	public String getNome() {
		return this.nome;
	}
	
}

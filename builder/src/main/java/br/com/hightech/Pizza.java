package br.com.hightech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
	private String nome;
	private TipoDeMolho molho;
	private String recheio;
	private boolean bordaRecheada;
	private List<Adicional> adicionais;

	public Pizza(String nome, TipoDeMolho molho, String recheio, boolean bordaRecheada) {
		this.nome = nome;
		this.molho = molho;
		this.recheio = recheio;
		this.bordaRecheada = bordaRecheada;
		adicionais = new ArrayList<Adicional>();
	}

	public String getNome() {
		return nome;
	}

	public TipoDeMolho getMolho() {
		return molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public void colocarAzeitonasPretas() {
		Adicional adicionalDeAzeitonasPretas = new Adicional("Azeitonas Pretas");
		adicionais.add(adicionalDeAzeitonasPretas);
	}

	public List<Adicional> getAdicionais() {
		return Collections.unmodifiableList(adicionais);
	}

	public boolean isBordaRecheada() {
		return bordaRecheada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adicionais == null) ? 0 : adicionais.hashCode());
		result = prime * result + (bordaRecheada ? 1231 : 1237);
		result = prime * result + ((molho == null) ? 0 : molho.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((recheio == null) ? 0 : recheio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (adicionais == null) {
			if (other.adicionais != null)
				return false;
		} else if (!adicionais.equals(other.adicionais))
			return false;
		if (bordaRecheada != other.bordaRecheada)
			return false;
		if (molho != other.molho)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (recheio == null) {
			if (other.recheio != null)
				return false;
		} else if (!recheio.equals(other.recheio))
			return false;
		return true;
	}

	public void colocarCebola() {
		Adicional adicionalDeAzeitonasPretas = new Adicional("Cebola");
		adicionais.add(adicionalDeAzeitonasPretas);
	}

	public void colocarRequeijao() {
		Adicional adicionalDeAzeitonasPretas = new Adicional("Rqueijão");
		adicionais.add(adicionalDeAzeitonasPretas);
	}
}

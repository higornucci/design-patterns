package br.com.htcursos;

public class Compra {
	private int codigo;
	private double valor;
	private String descricao;
	private Aprovador aprovador;

	public Compra(int codigo, double valor, String descricao) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}

	public Aprovador getAprovador() {
		return aprovador;
	}

	public void aprovadaPor(Aprovador aprovador) {
		this.aprovador = aprovador;
	}

	public String getDescricao() {
		return descricao;
	}
}

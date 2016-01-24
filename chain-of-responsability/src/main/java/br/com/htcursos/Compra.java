package br.com.htcursos;

public class Compra {
	private int codigo;
	private double valor;
	private String descricao;
	
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

	public String getDescricao() {
		return descricao;
	}
}

package br.com.htcursos;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Arquivo {

	private String nome;
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();

	public Diretorio(String nome) {
		this.nome = nome;
	}

	public void adicionar(Arquivo arquivo) {
		arquivos.add(arquivo);
	}

	public void exibirDiretorio() {
		System.out.println(CompositeDemo.identacao + nome);
		CompositeDemo.identacao.append("   ");
		for (int i = 0; i < arquivos.size(); ++i) {
			Arquivo arquivo = (Arquivo) arquivos.get(i);
			arquivo.exibirDiretorio();
		}
		CompositeDemo.identacao.setLength(CompositeDemo.identacao.length() - 3);
	}
}

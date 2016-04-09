package br.com.hightech;

public class RelatorioDeAuditoria extends Documento {

	@Override
	public void criarTopicos() {
		this.adicionar(new Introducao());
		this.adicionar(new Resultados());
		this.adicionar(new Conclusao());
		this.adicionar(new Sumario());
	}

}

package br.com.hightech;

public class RelatorioDeAuditoria extends Documento {

	@Override
	public void criarPaginas() {
		this.getPaginas().add(new Introducao());
		this.getPaginas().add(new Resultados());
		this.getPaginas().add(new Conclusao());
		this.getPaginas().add(new Sumario());
	}

}

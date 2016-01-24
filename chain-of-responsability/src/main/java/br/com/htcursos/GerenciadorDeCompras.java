package br.com.htcursos;

public class GerenciadorDeCompras {
	public void verificar(Compra compra) {
		Aprovador supervisor = new Supervisor();
		Aprovador gerente = new Gerente();
		Aprovador presidente = new Presidente();

		supervisor.adicionarSucessor(gerente);
		gerente.adicionarSucessor(presidente);

		supervisor.verificar(compra);
	}
}

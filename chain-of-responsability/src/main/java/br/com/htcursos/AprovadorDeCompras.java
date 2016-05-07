package br.com.htcursos;

public class AprovadorDeCompras {
	public void aprovar(Compra compra) {
		Aprovador supervisor = new Supervisor();
		Aprovador gerente = new Gerente();
		Aprovador presidente = new Presidente();

		supervisor.adicionarSucessor(gerente);
		gerente.adicionarSucessor(presidente);

		supervisor.aprovar(compra);
	}
}

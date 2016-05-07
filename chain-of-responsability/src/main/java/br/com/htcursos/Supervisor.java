package br.com.htcursos;

public class Supervisor extends Aprovador {

	@Override
	public void aprovar(Compra compra) {
		if (compra.getValor() < 10000.0) {
			compra.aprovadaPor(this);
			System.out.println(this.getClass().getName() + " aprovou a compra #" + compra.getCodigo());
		} else if (sucessor != null) {
			sucessor.aprovar(compra);
		}
	}
}

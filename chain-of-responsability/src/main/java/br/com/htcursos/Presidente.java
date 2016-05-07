package br.com.htcursos;

public class Presidente extends Aprovador {

	@Override
	public void aprovar(Compra compra) {
		if (compra.getValor() < 50000.0) {
			compra.aprovadaPor(this);
			System.out.println(this.getClass().getName() + " aprovou a compra #" + compra.getCodigo());
		} else if (sucessor != null) {
			System.out.println("A compra #" + compra.getCodigo() + " requer uma reuni�o dos executivos da empresa.");
		}
	}
}

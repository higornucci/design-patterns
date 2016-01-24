package br.com.htcursos;

public class Gerente extends Aprovador {

	@Override
	public void verificar(Compra compra) {
		if (compra.getValor() < 25000.0) {
			System.out.println(this.getClass().getName() + " aprovou a compra #" + compra.getCodigo());
		} else if (sucessor != null) {
			sucessor.verificar(compra);
		}
	}
}

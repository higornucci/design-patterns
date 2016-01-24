package br.com.htcursos;

public class Presidente extends Aprovador {

	@Override
	public void verificar(Compra compra) {
		if (compra.getValor() < 50000.0) {
			System.out.println(this.getClass().getName() + " aprovou a compra #" + compra.getCodigo());
		} else if (sucessor != null) {
			System.out.println("A compra #" + compra.getCodigo() + " requer uma reunião dos executivos da empresa.");
		}
	}
}

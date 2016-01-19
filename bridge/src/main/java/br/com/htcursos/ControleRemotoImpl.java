package br.com.htcursos;

public class ControleRemotoImpl extends ControleRemoto {
	private int canalAtual;

	public void proximoCanal() {
		canalAtual++;
		trocarParaOCanal(canalAtual);
	}

	public void canalAnterior() {
		canalAtual--;
		trocarParaOCanal(canalAtual);
	}
}

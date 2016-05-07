package br.com.htcursos;

public class ControleRemotoImpl extends ControleRemoto {
	private int canalAtual;

	public ControleRemotoImpl(ControleImbutido controleImbutido) {
		super(controleImbutido);
		this.canalAtual = 31;
	}

	public void proximoCanal() {
		canalAtual++;
		trocarParaOCanal(canalAtual);
	}

	public void canalAnterior() {
		canalAtual--;
		trocarParaOCanal(canalAtual);
	}
}

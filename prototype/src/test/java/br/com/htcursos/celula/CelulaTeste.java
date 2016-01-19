package br.com.htcursos.celula;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.htcursos.celula.Celula;
import br.com.htcursos.celula.CelulaTronco;

public class CelulaTeste {
	
	@Test
	public void deve_poder_clonar_uma_celula() throws Exception {
		Celula celulaTronco = new CelulaTronco();
		
		Celula celulaTroncoClonada = celulaTronco.clone();
		
		assertEquals(celulaTronco.funcao(), celulaTroncoClonada.funcao());
	}
}

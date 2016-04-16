package br.com.htcursos.celula;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CelulaTeste {
	
	@Test
	public void deve_poder_clonar_uma_celula() throws Exception {
		Celula celulaTronco = new CelulaTronco();

		Celula celulaTroncoClonada = celulaTronco.clone();

		assertEquals(celulaTronco.funcao(), celulaTroncoClonada.funcao());
	}

	@Test
	public void deve_poder_clonar_uma_hemacia() {
		Celula hemacia = new Hemacia();

		Celula hemaciaClonada = hemacia.clone();

		assertEquals(hemacia.funcao(), hemaciaClonada.funcao());
	}

    @Test
    public void deve_poder_clonar_uma_hemacia_cheia_de_oxigenio() {
        Hemacia hemacia = new Hemacia();
        hemacia.encherDeOxigenio();

        Hemacia hemaciaClonada = (Hemacia) hemacia.clone();

        assertTrue(hemaciaClonada.isCarregadaDeOxigenio());
    }
}

package br.com.htcursos.presidente;

import static org.junit.Assert.*;

import org.junit.Test;

public class PresidenteTeste {

	@Test
	public void deve_haver_um_presidente() throws Exception {
		String dilmaRousseff = "Dilma Rousseff";
		Presidente presidenteEsperado = Presidente.getInstance();
		
		presidenteEsperado.definir(dilmaRousseff);
		
		Presidente presidenteSingleton = Presidente.getInstance();
		assertEquals(presidenteEsperado.getNome(), presidenteSingleton.getNome());
	}
	
	@Test
	public void deve_haver_um_presidente_singleton() throws Exception {
		String dilmaRousseff = "Dilma Rousseff";

		Presidente presidenteSingleton = Presidente.getInstance();
		assertEquals(dilmaRousseff, presidenteSingleton.getNome());
	}
}

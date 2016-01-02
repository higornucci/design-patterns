package br.com.hightech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentoTeste {
	
	private static final int NUMERO_DE_PAGINAS_RELATORIO = 4;
	private static final int NUMERO_DE_PAGINAS_CURRICULUM = 3;

	@Test
	public void deve_criar_um_curriculum_com_tres_paginas() throws Exception {
		Documento curriculum = new CurriculumVitae();
		
		assertEquals(NUMERO_DE_PAGINAS_CURRICULUM, curriculum.getPaginas().size());
	}
	
	@Test
	public void deve_criar_um_relatorio_de_auditoria_com_quatro_paginas() throws Exception {
		Documento relatorio = new RelatorioDeAuditoria();
		
		assertEquals(NUMERO_DE_PAGINAS_RELATORIO, relatorio.getPaginas().size());
	}
}

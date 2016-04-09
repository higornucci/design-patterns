package br.com.hightech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentoTeste {
	
	private static final int NUMERO_DE_TOPICOS_RELATORIO = 4;
	private static final int NUMERO_DE_TOPICOS_CURRICULUM = 3;

	@Test
	public void deve_criar_um_curriculum_com_tres_topicos() throws Exception {
		Documento curriculum = new CurriculumVitae();
		
		assertEquals(NUMERO_DE_TOPICOS_CURRICULUM, curriculum.getTopicos().size());
	}
	
	@Test
	public void deve_criar_um_relatorio_de_auditoria_com_quatro_topicos() throws Exception {
		Documento relatorio = new RelatorioDeAuditoria();
		
		assertEquals(NUMERO_DE_TOPICOS_RELATORIO, relatorio.getTopicos().size());
	}
}

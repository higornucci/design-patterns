package br.com.htcursos;

import org.junit.Test;

public class ControleRemotoTeste {
    @Test
    public void deve_usar_um_controle_para_ligar_a_televisao() {
        ControleRemoto controleRemoto = new ControleRemotoImpl(new Sony());

        controleRemoto.ligar();
    }
}

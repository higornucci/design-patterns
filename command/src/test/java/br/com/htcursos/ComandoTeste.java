package br.com.htcursos;

import org.junit.Test;

public class ComandoTeste {

    @Test
    public void deve_criar_uma_lista_de_comandos() {
        Comando encanador = new Encanador();
        Comando designer = new Designer();
        Comando politico = new Politico();

        ListaDeComandos listaDeComandos = new ListaDeComandos();
        listaDeComandos.adicionar(encanador);
        listaDeComandos.adicionar(designer);
        listaDeComandos.remover(encanador);
        listaDeComandos.adicionar(politico);

        listaDeComandos.trabalhar();
    }
}

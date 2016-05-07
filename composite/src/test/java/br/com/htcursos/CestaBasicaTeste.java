package br.com.htcursos;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class CestaBasicaTeste {

    @Test
    public void deve_verificar_o_valor_de_uma_cesta_basica() {

        double valorDaCestaEsperado = 12.2D;
        Produto arroz = new Item("Arroz", 8D);
        Produto feijao = new Item("Feijao", 4.2D);
        Produto cestaBasica = new Cesta();
        cestaBasica.adicionar(arroz);
        cestaBasica.adicionar(feijao);

        double valorDaCestaRetornado = cestaBasica.getValor();

        assertThat(valorDaCestaEsperado, is(equalTo(valorDaCestaRetornado)));
    }

    @Test
    public void deve_adicionar_uma_cesta_dentro_da_cesta_basica(){

        double valorDaCestaEsperado = 23.2D;
        Produto arroz = new Item("Arroz", 8D);
        Produto feijao = new Item("Feijao", 4.2D);
        Produto cestaBasica = new Cesta();
        cestaBasica.adicionar(arroz);
        cestaBasica.adicionar(feijao);

        Produto pastaDeDente = new Item("Pasta de dente", 4D);
        Produto escovaDental = new Item("Escova dental", 7D);

        Produto kitDental = new Cesta();
        kitDental.adicionar(pastaDeDente);
        kitDental.adicionar(escovaDental);

        cestaBasica.adicionar(kitDental);

        double valorDaCestaRetornado = cestaBasica.getValor();

        assertThat(valorDaCestaEsperado, is(equalTo(valorDaCestaRetornado)));
    }
}


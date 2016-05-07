package br.com.htcursos;

import org.junit.Test;

public class FormaGeometricaColoridaTeste {

    private final int PONTO_X = 2;
    private final int PONTO_Y =3;
    private final int RAIO =1;
    private final int ALTURA = 3;
    private final int LARGURA = 4;
    @Test
    public void deve_criar_um_circulo_azul() {


        FormaGeometrica circulo =
                new Circulo(PONTO_X, PONTO_Y, RAIO, new FormaGeometricaAzul());

        circulo.desenhar();
    }

    @Test
    public void deve_criar_um_circulo_verde() {
        FormaGeometrica circulo =
                new Circulo(PONTO_X, PONTO_Y, RAIO, new FormaGeometricaVerde());

        circulo.desenhar();
    }

    @Test
    public void deve_criar_um_retangulo_azul() {
        FormaGeometrica retangulo =
                new Retangulo(ALTURA,LARGURA, new FormaGeometricaAzul());

        retangulo.desenhar();
    }
}

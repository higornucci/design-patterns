package br.com.htcursos;

/**
 * Created by Higor on 23/04/2016.
 */
public class Retangulo extends FormaGeometrica {
    private final int altura;
    private final int largura;
    private final FormaGeometricaColorida formaGeometricaColorida;

    public Retangulo(int altura, int largura, FormaGeometricaColorida formaGeometricaColorida) {
        super(formaGeometricaColorida);
        this.altura = altura;
        this.largura = largura;
        this.formaGeometricaColorida = formaGeometricaColorida;
    }

    String getTipoDaFormaGeometrica() {
        return "retângulo";
    }
}

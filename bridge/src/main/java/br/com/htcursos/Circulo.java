package br.com.htcursos;

/**
 * Created by Higor on 23/04/2016.
 */
public class Circulo extends FormaGeometrica {
    private final int pontoX;
    private final int pontoY;
    private final int raio;

    public Circulo(int pontoX, int pontoY, int raio, FormaGeometricaColorida formaGeometricaColorida) {
        super(formaGeometricaColorida);
        this.pontoX = pontoX;
        this.pontoY = pontoY;
        this.raio = raio;
    }

    final String getTipoDaFormaGeometrica() {
        return "círculo";
    }
}

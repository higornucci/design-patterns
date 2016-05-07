package br.com.htcursos;

/**
 * Created by Higor on 23/04/2016.
 */
public abstract class FormaGeometrica {
    private final FormaGeometricaColorida formaGeometricaColorida;

    public FormaGeometrica(FormaGeometricaColorida formaGeometricaColorida) {
        this.formaGeometricaColorida = formaGeometricaColorida;
    }

    public void desenhar() {
        System.out.println("Estou desenhando um " + getTipoDaFormaGeometrica() + " da cor "+ formaGeometricaColorida.retornarACor());
    }

    abstract String getTipoDaFormaGeometrica();
}

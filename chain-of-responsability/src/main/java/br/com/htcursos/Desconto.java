package br.com.htcursos;


public abstract class Desconto {

    protected Desconto sucessor;

    public abstract void aplicar();

    public void sucessor(Desconto desconto) {
        this.sucessor = desconto;
    }
}

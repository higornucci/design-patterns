package br.com.htcursos;

public abstract class Letra {
	protected char simbolo;
    protected int largura;
    protected int altura;
    protected int ascendente;
    protected int descendete;
    protected int tamanhoDoPonto;
 
    public abstract void mostrar(int tamanhoDoPonto);
}

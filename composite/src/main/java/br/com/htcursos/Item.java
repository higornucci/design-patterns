package br.com.htcursos;

/**
 * Created by Higor on 23/04/2016.
 */
public class Item extends Produto {

    private final String descricao;
    private final double valor;

    public Item(String descricao, double valor) {
        super();
        this.descricao = descricao;
        this.valor = valor;
    }

    public void adicionar(Produto arroz) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public double getValor() {
        return valor;
    }
}

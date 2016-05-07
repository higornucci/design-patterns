package br.com.htcursos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Higor on 23/04/2016.
 */
public class Cesta extends Produto {

    private double valor;
    private List<Produto> items;

    public Cesta(){
        items = new ArrayList<Produto>();
    }

    public void adicionar(Produto produto) {
        items.add(produto);
    }

    public double getValor() {
        double valorParcial= 0;
        for(Produto produto : items){
            valorParcial += produto.getValor();
        }
        return valorParcial;
    }
}

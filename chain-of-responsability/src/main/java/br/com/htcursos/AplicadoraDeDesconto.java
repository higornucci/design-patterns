package br.com.htcursos;

/**
 * Created by Higor on 07/05/2016.
 */
public class AplicadoraDeDesconto {
    Venda venda;

    public AplicadoraDeDesconto(Venda venda) {
        this.venda = venda;


    }

    public void aplicar() {
        Desconto vendaMaiorQueCem = new VendaMaiorQueCem(venda);
        vendaMaiorQueCem.sucessor(new VendaMaiorQueDuzentos(venda));
        vendaMaiorQueCem.aplicar();

    }
}

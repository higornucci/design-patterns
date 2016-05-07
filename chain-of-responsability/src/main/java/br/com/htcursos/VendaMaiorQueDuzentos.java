package br.com.htcursos;

/**
 * Created by Higor on 07/05/2016.
 */
public class VendaMaiorQueDuzentos extends Desconto {
    private Venda venda;

    public VendaMaiorQueDuzentos(Venda venda) {

        this.venda = venda;
    }

    public void aplicar() {
        if(venda.getValor() > 200){
            venda.setValor(venda.getValor()-(venda.getValor()*0.04));
        }
    }
}

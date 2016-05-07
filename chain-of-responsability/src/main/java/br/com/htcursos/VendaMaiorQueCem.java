package br.com.htcursos;

/**
 * Created by Higor on 07/05/2016.
 */
public class VendaMaiorQueCem extends Desconto {

    private Venda venda;

    public VendaMaiorQueCem(Venda venda) {
        this.venda = venda;
    }

    public void aplicar() {
        if(venda.getValor() > 100 && venda.getValor() <= 200){
            venda.setValor(venda.getValor()-(venda.getValor()*0.02));
        }else{
            sucessor.aplicar();
        }
    }
}

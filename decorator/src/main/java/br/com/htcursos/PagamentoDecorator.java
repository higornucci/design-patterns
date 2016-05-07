package br.com.htcursos;

/**
 * Created by Higor on 30/04/2016.
 */
public abstract class PagamentoDecorator extends Pagamento{
    protected final Pagamento pagamento;


    public PagamentoDecorator(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public abstract void pagarDivididoEntre(String ... usuario);
}

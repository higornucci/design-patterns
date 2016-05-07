package br.com.htcursos;

/**
 * Created by Higor on 30/04/2016.
 */
public class Conta {
    private Double valor;
    private boolean pago;

    public Conta(Double valor) {
    this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar(){
        pago=true;
    }

    public Double getValor() {
        return valor;
    }
}

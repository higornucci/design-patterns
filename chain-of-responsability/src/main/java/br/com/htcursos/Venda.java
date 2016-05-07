package br.com.htcursos;

public class Venda {
    private Integer codigo;
    private Double valor;

    public Venda(Integer codigo, Double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}

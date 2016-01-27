package br.com.htcursos;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDeInvestimento {
	private String simbolo;
    private double valor;
    private List<IInvestidor> investidores = new ArrayList<IInvestidor>();
	
    public CarteiraDeInvestimento(String simbolo, double preco) {
		this.simbolo = simbolo;
		this.valor = preco;
	}
    
    public void adicionar(IInvestidor investidor) {
    	investidores.add(investidor);
    }
    
    public void remover(IInvestidor investidor) {
    	investidores.remove(investidor);
    }
    
    public void ajustarIndice(double aumentoNoIndice) {
    	valor += aumentoNoIndice;
    	notificar();
    }

	private void notificar() {
		for (IInvestidor investidor : investidores) {
			investidor.atualizar();
		}
	}

	public String getSimbolo() {
		return simbolo;
	}

	public double getValor() {
		return valor;
	}
}

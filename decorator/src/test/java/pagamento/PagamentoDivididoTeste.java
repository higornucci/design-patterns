package pagamento;

import br.com.htcursos.Conta;
import br.com.htcursos.Pagamento;
import br.com.htcursos.PagamentoComDinheiro;
import br.com.htcursos.PagamentoDividido;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PagamentoDivididoTeste {

    @Test
    public void deve_poder_dividir_o_pagamento_entre_duas_pessoas() {
        Conta conta = new Conta(1200D);
        Pagamento pagamento = new PagamentoComDinheiro(conta);

        PagamentoDividido pagamentoDividido = new PagamentoDividido(pagamento);
        pagamentoDividido.pagarDivididoEntre("Higor", "Pedro");

        assertTrue(conta.isPago());
    }
}

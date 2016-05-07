import br.com.htcursos.AplicadoraDeDesconto;
import br.com.htcursos.Desconto;
import br.com.htcursos.Venda;
import br.com.htcursos.VendaMaiorQueCem;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class DescontoTeste {

    @Test
    public void deve_aplicar_desconto_para_compras_maiores_que_cem(){
        Venda venda = new Venda(123, 101d);
        Double valorEsperado = 98.98d;
        AplicadoraDeDesconto aplicadoraDeDesconto = new AplicadoraDeDesconto(venda);

        aplicadoraDeDesconto.aplicar();


        assertThat(venda.getValor(), is(equalTo(valorEsperado)));
    }

    @Test
    public void deve_aplicar_desconto_para_compras_maiores_que_duzentos(){
        Venda venda = new Venda(123, 201d);
        Double valorEsperado = 192.96d;
        AplicadoraDeDesconto aplicadoraDeDesconto = new AplicadoraDeDesconto(venda);

        aplicadoraDeDesconto.aplicar();


        assertThat(venda.getValor(), is(equalTo(valorEsperado)));
    }
}

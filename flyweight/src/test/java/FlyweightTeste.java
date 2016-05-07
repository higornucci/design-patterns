import br.com.htcursos.Letra;
import br.com.htcursos.LetrasFlyweight;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FlyweightTeste {
    @Test
    public void deve_utilizar_a_mesma_instancia_para_letras_repetidas() {
        LetrasFlyweight letrasFlyweight = new LetrasFlyweight();

        Letra letraA = letrasFlyweight.getLetra('A');
        Letra letraComMesmaInstancia = letrasFlyweight.getLetra('A');

        assertSame(letraA, letraComMesmaInstancia);
    }
}

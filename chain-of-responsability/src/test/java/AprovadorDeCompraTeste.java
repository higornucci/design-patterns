import br.com.htcursos.AprovadorDeCompras;
import br.com.htcursos.Compra;
import br.com.htcursos.Gerente;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AprovadorDeCompraTeste {

    @Test
    public void deve_aprovar_uma_compra_pelo_gerente() {
        Compra compra = new Compra(123, 12000D, "3 Notebooks para o time de desenvolvimento");

        AprovadorDeCompras aprovador = new AprovadorDeCompras();
        aprovador.aprovar(compra);

        assertTrue(compra.getAprovador() instanceof Gerente);
    }

    @Test
    public void ninguem_deve_aprovar_a_compra() {
        Compra compra = new Compra(123, 55000D, "300 Notebooks para o time de desenvolvimento");

        AprovadorDeCompras aprovador = new AprovadorDeCompras();
        aprovador.aprovar(compra);

        assertTrue(compra.getAprovador() == null);
    }
}

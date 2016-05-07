import br.com.htcursos.Compartilhavel;
import br.com.htcursos.ItemDaBiblioteca;
import br.com.htcursos.Livro;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CompartilhavelTeste {

    @Test
    public void deve_poder_compartilhar_um_livro_com_alguem() {
        int numeroDeCopiasInicial = 3;
        int numeroDeCopiasEsperado = 2;
        ItemDaBiblioteca codigoLimpo = new Livro("Uncle Bob", "Clean Code", numeroDeCopiasInicial);

        Compartilhavel codigoLimpoCompartilhavel = new Compartilhavel(codigoLimpo);
        codigoLimpoCompartilhavel.compartilharCom("Pedro");

        int numeroDeCopiasAtuais = codigoLimpoCompartilhavel.getNumeroDeCopias();

        assertThat(numeroDeCopiasAtuais, is(equalTo(numeroDeCopiasEsperado)));
    }
}

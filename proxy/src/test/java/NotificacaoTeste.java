import br.com.htcursos.Notificacao;
import br.com.htcursos.NotificacaoPorEmail;
import br.com.htcursos.NotificadorAssincrono;
import org.junit.Test;
import pagamento.NotificacaoViaSistema;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NotificacaoTeste {

    @Test
    public void deve_enviar_um_email_assincrono() throws InterruptedException {
        Notificacao notificacaoPorEmail = mock(NotificacaoPorEmail.class);

        NotificadorAssincrono notificadorAssincrono = new NotificadorAssincrono(notificacaoPorEmail);
        notificadorAssincrono.notificar();

        Thread.sleep(1000);
        verify(notificacaoPorEmail).notificar();
    }

    @Test
    public void deve_enviar_notificacao_via_sistema_assincrona() throws InterruptedException {
        Notificacao notificacaoPorSistema = mock(NotificacaoViaSistema.class);

        NotificadorAssincrono notificadorAssincrono = new NotificadorAssincrono(notificacaoPorSistema);
        notificadorAssincrono.notificar();

        Thread.sleep(1000);
        verify(notificacaoPorSistema).notificar();
    }

    @Test
    public void deve_enviar_email() {
        Notificacao notificacaoViaEmail = new NotificacaoPorEmail("higornucci@gmail.com");

        notificacaoViaEmail.notificar();
    }
}

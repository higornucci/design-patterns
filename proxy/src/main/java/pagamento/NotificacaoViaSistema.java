package pagamento;

import br.com.htcursos.Notificacao;

public class NotificacaoViaSistema implements Notificacao {

    public void notificar() {
        System.out.println("Estou notificando via sistema");
    }
}

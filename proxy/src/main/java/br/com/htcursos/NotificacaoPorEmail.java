package br.com.htcursos;

public class NotificacaoPorEmail implements Notificacao {

    private String email;

    public NotificacaoPorEmail(String email) {
        this.email = email;
    }

    public void notificar() {
        System.out.println("Estou enviando um email para: " + email);
    }
}

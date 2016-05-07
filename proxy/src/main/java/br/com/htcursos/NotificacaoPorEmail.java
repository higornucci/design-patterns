package br.com.htcursos;

public class NotificacaoPorEmail implements Notificacao {

    public void notificar(String email) {
        System.out.println("Estou enviando um email para: " + email);
    }
}

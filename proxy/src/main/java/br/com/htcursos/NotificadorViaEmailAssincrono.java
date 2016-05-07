package br.com.htcursos;

public class NotificadorViaEmailAssincrono implements Notificacao {
	
	private final Notificacao notificador;

	public NotificadorViaEmailAssincrono(Notificacao notificacao) {
		notificador = notificacao;
	}

	public void notificar(final String email) {
		Runnable enviadorRunnable = new Runnable() {
			public void run() {
				try {
					notificador.notificar(email);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(enviadorRunnable);
		thread.start();
	}
}

package br.com.htcursos;

public class NotificadorAssincrono implements Notificacao {
	
	private final Notificacao notificador;

	public NotificadorAssincrono(Notificacao notificacao) {
		notificador = notificacao;
	}

	public void notificar() {
		Runnable enviadorRunnable = new Runnable() {
			public void run() {
				try {
					notificador.notificar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(enviadorRunnable);
		thread.start();
	}
}

public class NotificacionAppMovil extends Notificacion {
    private String idDispositivo;
    private String plataforma;

    public NotificacionAppMovil(String codigo, Usuario destinatario, String mensaje, String idDispositivo, String plataforma) {
        super(codigo, destinatario, mensaje);
        this.idDispositivo = idDispositivo;
        this.plataforma = plataforma;
    }

    public void enviar() {
        if (idDispositivo == null || idDispositivo.isEmpty()) {
            marcarFallida();
            return;
        }
        marcarEnviada();
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public String getPlataforma() {
        return plataforma;
    }
}

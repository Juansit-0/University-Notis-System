public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;
    private String operador;

    public NotificacionSMS(String codigo, Usuario destinatario, String mensaje, String numeroTelefono, String operador) {
        super(codigo, destinatario, mensaje);
        this.numeroTelefono = numeroTelefono;
        this.operador = operador;
    }

    public void enviar() {
        if (numeroTelefono == null || numeroTelefono.length() < 10) {
            marcarFallida();
            return;
        }
        marcarEnviada();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getOperador() {
        return operador;
    }
}

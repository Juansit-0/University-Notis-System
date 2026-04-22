import java.time.LocalDateTime;

public abstract class Notificacion {
    protected String codigo;
    protected Usuario destinatario;
    protected String mensaje;
    protected LocalDateTime fechaEnvio;
    protected EstadoNotificacion estado;

    public Notificacion(String codigo, Usuario destinatario, String mensaje) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    public abstract void enviar();

    protected void marcarEnviada() {
        this.estado = EstadoNotificacion.ENVIADA;
        this.fechaEnvio = LocalDateTime.now();
    }

    protected void marcarFallida() {
        this.estado = EstadoNotificacion.FALLIDA;
        this.fechaEnvio = LocalDateTime.now();
    }

    public String getCodigo() {
        return codigo;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }
}

import java.util.ArrayList;
import java.util.List;

public class ServicioNotificaciones {
    private List<Notificacion> historial;

    public ServicioNotificaciones() {
        this.historial = new ArrayList<>();
    }

    public void enviarNotificacion(Notificacion notificacion, TipoSituacion situacion) {
        ajustarMensajePorSituacion(notificacion, situacion);
        notificacion.enviar();
        historial.add(notificacion);
    }

    private void ajustarMensajePorSituacion(Notificacion notificacion, TipoSituacion situacion) {
        String mensajeBase = notificacion.getMensaje();

        switch (situacion) {
            case PUBLICACION_CALIFICACIONES:
                notificacion.mensaje = "Publicacion de calificaciones: " + mensajeBase;
                break;
            case RECORDATORIO_PAGO_MATRICULA:
                notificacion.mensaje = "Recordatorio de pago de matricula: " + mensajeBase;
                break;
            case CANCELACION_CLASE:
                notificacion.mensaje = "Aviso de cancelacion de clase: " + mensajeBase;
                break;
            case CONFIRMACION_EVENTO_ACADEMICO:
                notificacion.mensaje = "Confirmacion de inscripcion a evento academico: " + mensajeBase;
                break;
            default:
                break;
        }
    }

    public List<Notificacion> getHistorial() {
        return historial;
    }
}

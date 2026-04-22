public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();

        Usuario usuario1 = new Estudiante("EST-2026-001", "Ana Perez", "ana@correo.com", "3001234567", "Ingenieria de Sistemas");
        Usuario usuario2 = new Estudiante("EST-2026-002", "Luis Gomez", "luis@correo.com", "3014567890", "Medicina");
        Usuario usuario3 = new Profesor("PRO-2026-001", "Maria Torres", "maria@correo.com", "3027788990", "Ciencias Basicas");
        Usuario usuario4 = new Administrativo("ADM-2026-001", "Carlos Ruiz", "carlos@correo.com", "3031122334", "Bienestar Universitario");

        Notificacion noti1 = new NotificacionCorreo(
                "NOT-COR-2026-001",
                usuario1,
                "Ya estan disponibles en el portal.",
                "ana@correo.com",
                "Calificaciones publicadas"
        );

        Notificacion noti2 = new NotificacionSMS(
                "NOT-SMS-2026-001",
                usuario2,
                "Su fecha limite de pago es el 30 de abril.",
                "3001234567",
                "MovilCom"
        );

        Notificacion noti3 = new NotificacionAppMovil(
                "NOT-APP-2026-001",
                usuario3,
                "La clase de Programacion de hoy fue cancelada.",
                "device-8891",
                "Android"
        );

        Notificacion noti4 = new NotificacionCorreo(
                "NOT-COR-2026-002",
                usuario4,
                "Su registro al seminario fue exitoso.",
                "carlos@correo.com",
                "Inscripcion confirmada"
        );

        servicio.enviarNotificacion(noti1, TipoSituacion.PUBLICACION_CALIFICACIONES);
        servicio.enviarNotificacion(noti2, TipoSituacion.RECORDATORIO_PAGO_MATRICULA);
        servicio.enviarNotificacion(noti3, TipoSituacion.CANCELACION_CLASE);
        servicio.enviarNotificacion(noti4, TipoSituacion.CONFIRMACION_EVENTO_ACADEMICO);

        for (Notificacion notificacion : servicio.getHistorial()) {
            Usuario usuario = notificacion.getDestinatario();
            System.out.println("REGISTRO DE NOTIFICACION");
            System.out.println("Codigo Notificacion: " + notificacion.getCodigo());
            System.out.println("Usuario: " + usuario.getNombre() + " (" + usuario.getTipoUsuario() + ")");
            System.out.println("ID Usuario: " + usuario.getId());
            System.out.println("Canal y Mensaje: " + notificacion.getMensaje());
            System.out.println("Fecha de Envio: " + notificacion.getFechaEnvio());
            System.out.println("Estado Final: " + notificacion.getEstado());
            System.out.println();
        }
    }
}

public class Estudiante extends Usuario {
    private String programa;

    public Estudiante(String id, String nombre, String correo, String telefono, String programa) {
        super(id, nombre, correo, telefono);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public String getTipoUsuario() {
        return "Estudiante";
    }
}

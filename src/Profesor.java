public class Profesor extends Usuario {
    private String departamento;

    public Profesor(String id, String nombre, String correo, String telefono, String departamento) {
        super(id, nombre, correo, telefono);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTipoUsuario() {
        return "Profesor";
    }
}

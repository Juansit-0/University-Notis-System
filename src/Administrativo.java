public class Administrativo extends Usuario {
    private String area;

    public Administrativo(String id, String nombre, String correo, String telefono, String area) {
        super(id, nombre, correo, telefono);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public String getTipoUsuario() {
        return "Administrativo";
    }
}

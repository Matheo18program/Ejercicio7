package modelo;

public class Docente {
    private String nombre;
    private long documento;
    private String telefono;
    private String email;

    public Docente() {
    }

    public Docente(String nombre, long documento, String telefono, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public long getDocumento() { return documento; }
    public void setDocumento(long documento) { this.documento = documento; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

package paquete5;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String username;

    public Persona(String nomb, String apell, String user) {
        nombre = nomb;
        apellido = apell;
        username = user;
    }

    public Persona(String c) {
        nombre = c;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerUsername(String c) {
        username = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                nombre, apellido, username);
        return reporte;
    }
}

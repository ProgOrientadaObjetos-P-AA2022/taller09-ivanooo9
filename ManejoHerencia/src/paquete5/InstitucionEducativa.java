
package paquete5;

public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nomb, String sigls) {
        nombre = nomb;
        siglas = sigls;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        siglas = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    } 
}

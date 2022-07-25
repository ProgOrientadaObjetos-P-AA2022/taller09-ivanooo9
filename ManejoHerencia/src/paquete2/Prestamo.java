
package paquete2;
import paquete5.*;
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona benefi, int tiempres, String ciudpres) {
        beneficiario = benefi;
        tiempoPrestamo = tiempres;
        ciudadPrestamo = ciudpres;

    }

    public void establecerBeneficiario(Persona c) {
        beneficiario = c;
    }

    public void establecerTiempoPrestamo(int c) {
        tiempoPrestamo = c;
    }

    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s\n"
                + "Tiempo del préstamo en meses: %d\n"
                + "Ciudad: %s\n",
                beneficiario, tiempoPrestamo, ciudadPrestamo);
        return cadena;
    }  
}


package paquete4;
import paquete5.*;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo{
    protected String nivelEstudio;
    protected InstitucionEducativa centroEducativo;
    protected double valorCarrera;
    protected double valorMensual;

    public PrestamoEducativo(Persona pers, int num, String nom, String nivel,
            InstitucionEducativa centedu, double valorc) {
        super(pers, num, nom);
        nivelEstudio = nivel;
        centroEducativo = centedu;
        valorCarrera = valorc;

    }

    public void establecerNivelEstudio(String c) {
        nivelEstudio = c;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerValorCarrera(double c) {
        valorCarrera = c;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera / tiempoPrestamo)- 
                ((valorCarrera / tiempoPrestamo) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String reporte = "===================\n"+
                         "\nPRESTAMO EDUCATIVO\n"+
                         "=====================\n";
        reporte = String.format("%s%s",reporte, super.toString());
        reporte = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago para le prestamo: %.2f\n",
                reporte,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return reporte;
    }
}

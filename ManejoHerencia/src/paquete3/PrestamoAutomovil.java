
package paquete3;
import paquete5.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo{
    protected String tipoAuto;
    protected String marcaAuto;
    protected Persona garante1;
    protected double valorAutomovil;
    protected double valorMensual;

    public PrestamoAutomovil(Persona per, int num, String nom, String tipo,
                            String marca, Persona garant, double valor) {
        super(per, num, nom);
        tipoAuto = tipo;
        marcaAuto = marca;
        garante1 = garant;
        valorAutomovil = valor;
        

    }

    public void establecerTipo(String c) {
        tipoAuto = c;
    }

    public void establecerMarca(String c) {
        marcaAuto = c;
    }

    public void establecerGarante(Persona c) {
        garante1 = c;
    }

    public void establecerValorAutomovil(double c) {
        valorAutomovil = c;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiempoPrestamo;
    }

    public String obtenerTipo() {
        return tipoAuto;
    }

    public String obtenerMarca() {
        return marcaAuto;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "====================\n"+
                             "\nPRESTAMO AUTOMOVIL\n"+
                             "====================\n";
        cadenaFinal = String.format("%s\n%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "Valor mensual de pago del prestamo: %.2f\n",
                cadenaFinal,
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante(),
                obtenerValorAutomovil(),
                obtenerValorMensual());


        return cadenaFinal;
    }
}

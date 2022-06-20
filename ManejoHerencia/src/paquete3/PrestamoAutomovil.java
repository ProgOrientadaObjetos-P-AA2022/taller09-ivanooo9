/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    String tipoautomovil;
    String marca;
    String garante;
    double valorauto;
    double valormensualpago;

    public PrestamoAutomovil(String n, String ap, String iden, double e,
            double numAsg) {
        super(n, ap, iden, e, numAsg);
        tipoautomovil = n;
        marca = ap;
        garante = iden;
        valorauto = e;
        valormensualpago = numAsg;

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getValorauto() {
        return valorauto;
    }
    public void setValorauto(double valorauto) {
        this.valorauto = valorauto;
    } 
    public String getGarante() {
        return garante;
    }

    public void setGarante(String garante) {
        this.garante = garante;
    }
    public String getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(String tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    
    public void calcularmensualpago() {
        double valorc = 0;
        valorc = valorauto  / tiempoPrestamo;
        valormensualpago = valorc;
    }


    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                getMarca(),
                getValorauto(),
                getGarante(),getTipoautomovil());

        return cadenaFinal;
    }

}
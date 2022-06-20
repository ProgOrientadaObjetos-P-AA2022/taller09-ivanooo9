/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected String beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;
    
    public Prestamo(String b, int t, String c){
        beneficiario = b;
        tiempoPrestamo = t;
        ciudadPrestamo = c;
        
    }
    /* public void establecerbeneficiario(String ben){
        beneficiario = ben;
    }
    public void establecertiempoPrestamo(int ti){
        tiempoPrestamo = ti;
    }
    public void establecerciudadPrestamo(String ciu){
        ciudadPrestamo = ciu;
    } */

    public Prestamo(String n, String ap, String iden, double e, double numAsg) {
    }

    public Prestamo(String n, String ce, double vac, double vam) {
    }
}
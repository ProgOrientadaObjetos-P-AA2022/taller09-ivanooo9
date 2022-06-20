/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;


import java.util.Locale;
import java.util.Scanner;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete2.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int op;

        System.out.println("[1] Prestamo Automovil\n"
                + "[2] Prestamo Educativo\n");
        op = entrada.nextInt();

        if (op < 1 || op > 2) {
            System.err.println("Error, opción no válida.");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese cedula: ");
            String cedula = entrada.nextLine();

            switch (op) {
                case 1:
                PrestamoAutomovil automovil1 = new PrestamoAutomovil(cedula, cedula, cedula, op, op);
                    
                    System.out.println("Ingrese tipo automovil: ");
                    automovil1.setTipoautomovil(entrada.nextLine());
                    System.out.println("Ingrese la marca: ");
                    automovil1.setMarca(entrada.nextLine());
                    System.out.println("Ingrese el garante: ");
                    automovil1.setGarante(entrada.nextLine());
                    System.out.println("Ingrese el Valor Auto: ");
                    automovil1.setGarante(entrada.nextLine());
                    System.out.println("Ingrese el garante: ");
                    automovil1.setGarante(entrada.nextLine());
                    automovil1.calcularmensualpago();
                    System.out.printf("%s\n", automovil1);
                    break;
                    
                case 2:
                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(cedula, cedula, op, op);
                    /* prestamoEducativo.establecerNombres(nombres);
                    prestamoEducativo.establecerId(cedula); */

                    System.out.println("Nivel de Estudio: ");
                    prestamoEducativo.setNivelestudio(entrada.nextLine());
                    System.out.println("Ingrese el centro Educativo: ");
                    prestamoEducativo.setCentroeducativo(entrada.nextLine());
                    System.out.println("Ingrese el valor de la carrera: ");
                    prestamoEducativo.setValorcarrera(entrada.nextDouble());
        
                    prestamoEducativo.calcularmensualpago();
                    System.out.printf("%s\n", prestamoEducativo);
                    break;
                default: break;
            }
        }
    }
}
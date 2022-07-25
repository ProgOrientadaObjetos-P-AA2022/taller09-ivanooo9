
package paquete1;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5. *;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String cadena = "";
        String cadena1 = "";
        String pregunta = "";
        int opcion;
        do{
        System.out.println("Elija el tipo de prestamo\n"
                + "Prestamo Automovil  [1]\n"
                + "Prestamo Educativo  [2]\n"
                + "Finalizar Programa  [0]");
        
        opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1 || opcion == 2) {

            System.out.println("\nIngrese el Nombre del Beneficiario");
            String beneficiario = sc.nextLine();
            System.out.println("Ingrese el Apellido del Beneficiario");
            String apellido = sc.nextLine();
            System.out.println("Ingrese el Username del Beneficiario");
            String username = sc.nextLine();
            System.out.println("Ingrese la cantidad de meses a pagar el "
                    + "préstamo");
            int meses = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la ciudad");
            String ciudad = sc.nextLine();

            Persona persona = new Persona(beneficiario, apellido, username);
            persona.establecerNombre(beneficiario);
            persona.establecerApellido(apellido);
            persona.establecerUsername(username);

            switch (opcion) {

                case 1:
                    do {
                        System.out.println("Ingrese Tipo (Automovil)");
                        String tipo = sc.nextLine();
                        System.out.println("Ingrese Marca (Automovil)");
                        String marca = sc.nextLine();
                        System.out.println("Ingrese Nombre (Garante)");
                        String nomGarant = sc.nextLine();
                        System.out.println("Ingrese Apellido (Garante)");
                        String apellidGarant = sc.nextLine();
                        System.out.println("Ingrese Username (Garante)");
                        String userGarant = sc.nextLine();
                        System.out.println("Ingrese Valor    (Automovil)");
                        double valorAuto = sc.nextDouble();
                        

                        Persona garante1 = new Persona(nomGarant, apellidGarant, userGarant);
                        garante1.establecerNombre(nomGarant);
                        garante1.establecerApellido(apellidGarant);
                        garante1.establecerUsername(userGarant);

                        PrestamoAutomovil presaAuto = new PrestamoAutomovil(persona, meses,
                                ciudad, tipo, marca, garante1, valorAuto);
                        presaAuto.establecerBeneficiario(persona);
                        presaAuto.establecerTiempoPrestamo(meses);
                        presaAuto.establecerCiudadPrestamo(ciudad.toLowerCase());
                        presaAuto.establecerTipo(tipo);
                        presaAuto.establecerMarca(marca);
                        presaAuto.establecerGarante(garante1);
                        presaAuto.establecerValorAutomovil(valorAuto);
                        presaAuto.calcularValorMensual();

                        System.out.println("Quiere adquirir otro Prestamo. Escriba la letra"
                                + " A para continuar ,digite la letra N para salir");
                        sc.nextLine();
                        pregunta = sc.nextLine();

                        cadena = String.format("%s%s\n", cadena, presaAuto);

                    } while (pregunta.equals("A"));
                    System.out.println(cadena);
                    break;

                case 2:
                    do {
                        System.out.println("Ingrese su nivel de estudio");
                        String nivelEst = sc.nextLine();
                        System.out.println("Ingrese el nombre del Centro educativo");
                        String nomCenEdu = sc.nextLine();
                        System.out.println("Ingrese las siglas del Centro Educativo");
                        String siglas = sc.nextLine();
                        System.out.println("Ingrese el valor de la carrera");
                        double valorCarre = sc.nextDouble();
                        

                        InstitucionEducativa edu1 = new InstitucionEducativa(nomCenEdu,
                                siglas);

                        PrestamoEducativo presEdu = new PrestamoEducativo(persona,
                                meses, ciudad, nivelEst, edu1, valorCarre);

                        presEdu.establecerBeneficiario(persona);
                        presEdu.establecerTiempoPrestamo(meses);
                        presEdu.establecerCiudadPrestamo(ciudad.toUpperCase());
                        presEdu.establecerNivelEstudio(nivelEst);
                        presEdu.establecerCentroEducativo(edu1);
                        presEdu.establecerValorCarrera(valorCarre);
                        presEdu.calcularValorMensual();

                        System.out.println("Desea solicitar otro prestamo. Digite la letra"
                                + " A para continuar, digite la letra N para salir");
                        sc.nextLine();
                        pregunta = sc.nextLine();

                        cadena1 = String.format("%s%s\n", cadena1, presEdu);

                    } while (pregunta.equals("A"));
                    System.out.println(cadena1);
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese 1 o 2");

            }

        } else if(opcion != 0) {
            System.out.println("Opcion no valida!!!");
        }else{
            System.out.println("Programa finalizado. . .");
        }
        }while(opcion != 0);
    } 
}

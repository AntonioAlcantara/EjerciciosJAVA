/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;
import ejerciciosjava.*;

/**
 *
 * @author Antonio
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    ejercicio1.ejerciciojava1(args);
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    ejercicio2.ejerciciojava2(args);
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    ejercicio3.ejerciciojava3(args);
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    ejercicio4.ejerciciojava4(args);
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    ejercicio5.ejerciciojava5(args);
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6");
                    ejercicio6.ejerciciojava6(args);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}

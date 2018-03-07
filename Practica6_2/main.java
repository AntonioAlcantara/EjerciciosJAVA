/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6_2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("___________________________________");
            System.out.println("|1. Crear Empleado                |");
            System.out.println("|2. Crear Comercial               |");
            System.out.println("|3. Crear Repartidor              |");
            System.out.println("|4. Mostrar Atributos             |");
            System.out.println("|5. Salir                         |");
            System.out.println("___________________________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    
                    break;
                case 2:
                    System.out.println("OPCION 2");
                   
                    break;
                case 3:
                    System.out.println("OPCION 3");
                    
                    break;
                case 4:
                    System.out.println("OPCION 4");
                    
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_4;

import java.util.ArrayList;
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
        ArrayList<libro> lista_libro = new ArrayList<>();
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("_______________________");
            System.out.println("|1. Crear libro       |");
            System.out.println("|2. Prestar libro     |");
            System.out.println("|3. Devolver libro    |");
            System.out.println("|4. Localizar libro   |");
            System.out.println("|5. Salir             |");
            System.out.println("_______________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    lista_libro.add(libro.crear_libro());
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    libro.pedir_prestar_libro(lista_libro);
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    libro.pedir_devolver_libro(lista_libro);
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    libro.pedir_localizar_libro(lista_libro);
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

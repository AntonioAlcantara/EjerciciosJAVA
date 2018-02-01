/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movil persona = new movil();
        persona.setContacto("Antonio");
        persona.setNumero(607077182);
        movil persona2 = new movil();
        persona2.setContacto("Miguel");
        persona2.setNumero(600900900);
        movil app = new movil();
        movil chat = new movil();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("________IPHONE X_______");
            System.out.println("|1. Contactos         |");
            System.out.println("|2. Bloc de Notas     |");
            System.out.println("|3. Descargar Apps    |");
            System.out.println("|4. Apagar            |");
            System.out.println("_______________________");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Contacto: " + persona.getContacto() + " Numero:" + persona.getNumero());
                    System.out.println("Contacto: " + persona2.getContacto() + " Numero:" + persona2.getNumero());

                    break;
                case 2:

                    chat.mensajes();
                    break;
                case 3:
                    app.aplicaciones();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }

    }

}

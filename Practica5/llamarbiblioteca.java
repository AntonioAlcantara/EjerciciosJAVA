/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class llamarbiblioteca {

    // TODO code application logic here
    public static void menubiblioteca() {
        Scanner sn = new Scanner(System.in);
        ArrayList<biblioteca> redbiblioteca = new ArrayList<>();
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //HE CREADO DOS BIBLIOTECAS PREDETERMINADAS
        biblioteca biblioteca1=new biblioteca();
        biblioteca1.setId_biblioteca(001);
        biblioteca1.setNombre_biblioteca("Biblioteca1");
        biblioteca1.setDireccion("Calle Plomo");
        biblioteca1.setLista_libro(redbiblioteca);
        biblioteca1.setLista_personas(redbiblioteca);
        redbiblioteca.add(biblioteca1);
        biblioteca biblioteca2=new biblioteca();
        biblioteca2.setId_biblioteca(002);
        biblioteca2.setNombre_biblioteca("Biblioteca2");
        biblioteca2.setDireccion("Calle Plata");
        biblioteca2.setLista_libro(redbiblioteca);
        biblioteca2.setLista_personas(redbiblioteca);
        redbiblioteca.add(biblioteca2);
        //___________________________________________
        while (!salir) {
            System.out.println("___________________________________");
            System.out.println("|1. Dar de alta bibliotecas       |");
            System.out.println("|2. Dar de alta/baja libros       |");
            System.out.println("|3. Dar de alta/baja personas     |");
            System.out.println("|4. Estadisticas biblioteca       |");
            System.out.println("|5. Estadisticas red de biblioteca|");
            System.out.println("|6. Salir                         |");
            System.out.println("___________________________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    redbiblioteca.add(biblioteca.alta_biblioteca());
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    biblioteca.dar_de_alta_libros(redbiblioteca);
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    biblioteca.dar_alta_persona(redbiblioteca);
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }

    }
}

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
public class main {

    public static ArrayList<libro> lista_libro = new ArrayList<>();
    public static ArrayList<biblioteca> redbiblioteca = new ArrayList<>();
    public static ArrayList<usuario> lista_personas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        //HE CREADO DOS BIBLIOTECAS PREDETERMINADAS
        // biblioteca biblioteca1 = new biblioteca();
        // biblioteca1.setId_biblioteca(001);
        // biblioteca1.setNombre_biblioteca("Biblioteca1");
        // biblioteca1.setDireccion("Calle Plomo");
        // biblioteca1.setLista_libro(redbiblioteca);
        //biblioteca1.setLista_personas(redbiblioteca);
        //redbiblioteca.add(biblioteca1);

//USUARIO DE PRUEBA________________
        usuario persona1 = new usuario();
        persona1.setNombre("Antonio");
        persona1.setApellidos("Alcantara");
        persona1.setDni("41587716J");
        persona1.setCargo("administrador");
        persona1.setNombreusuario("paygin");
        persona1.setContraseña("pescanova");
        lista_personas.add(persona1);
        //libro prueba
        //libro libro1 = new libro();
        //libro1.setTitulo("Gris");
        //libro1.setAutor("Antonio");
        // libro1.setIsbn("001");
        // libro1.setNum_ejem_pres(2);
        //libro1.setNum_ejem_tot(100);
        //lista_libro.add(libro1);
        //_______________________________

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {

            System.out.println("___________________________________");
            System.out.println("|1. Gestion administrativa        |");
            System.out.println("|2. Utilidades usuario            |");
            System.out.println("|3.Salir                          |");
            System.out.println("___________________________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    System.out.println("Valida el usuario y contraseña:");
                    usuario.validar_usuario(lista_personas);
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    main.menulibro();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }

    }

    public static void menubiblioteca() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //___________________________________________
        while (!salir) {
            System.out.println("___________________________________");
            System.out.println("|1. Dar de alta bibliotecas       |");
            System.out.println("|2. Dar de alta libros            |");
            System.out.println("|3. Dar de alta personas          |");
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
                    biblioteca.pedir_localizar_biblioteca(redbiblioteca);
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

    public static void menulibro() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("___________________________________");
            System.out.println("|1. CONSULTAR LIBRO               |");
            System.out.println("|2. CONSULTAR LIBRO BIBLIOTECA    |");
            System.out.println("|3. DEVOLVER LIBRO                |");
            System.out.println("|4. RESERVAR LIBRO                |");
            System.out.println("|5. Salir                         |");
            System.out.println("___________________________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    biblioteca.pedir_localizar_libro(redbiblioteca);
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    biblioteca.pedir_localizar_libro_biblioteca(redbiblioteca);
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    biblioteca.pedir_devolver_libro_biblioteca(redbiblioteca);
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    biblioteca.pedir_reservar_libro_biblioteca(redbiblioteca);
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

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
public class biblioteca {

    private int id_biblioteca;
    private String nombre_biblioteca;
    private String direccion;
    public static ArrayList<libro> lista_libro;
    public static ArrayList<usuario> lista_personas;

    public biblioteca() {

    }

    public biblioteca(int id_biblioteca, String nombre_biblioteca, String direccion, ArrayList<libro> lista_libro, ArrayList<usuario> lista_personas) {
        this.id_biblioteca = id_biblioteca;
        this.nombre_biblioteca = nombre_biblioteca;
        this.direccion = direccion;
        biblioteca.lista_libro = lista_libro;
        biblioteca.lista_personas = lista_personas;
    }

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList getLista_libro() {
        return lista_libro;
    }

    public void setLista_libro(ArrayList lista_libro) {
        biblioteca.lista_libro = lista_libro;
    }

    public ArrayList getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList lista_personas) {
        biblioteca.lista_personas = lista_personas;
    }

//METODO DAR DE ALTA BIBLIOTECA
    public static biblioteca predeterminada_biblioteca(int id, String nombre, String direccion) {
        biblioteca mibiblioteca = new biblioteca();
        System.out.println("CREACION DE BIBLIOTECA");
        System.out.println("Dime el id de la biblioteca:");
        mibiblioteca.setId_biblioteca(id);
        System.out.println("Dime el nombre de la biblioteca:");
        mibiblioteca.setNombre_biblioteca(nombre);
        System.out.println("Dime la direccion de la biblioteca:");
        mibiblioteca.setDireccion(direccion);
        ArrayList<libro> lista_libro = new ArrayList<>();
        mibiblioteca.setLista_libro(lista_libro);
        ArrayList<usuario> lista_personas = new ArrayList<>();
        mibiblioteca.setLista_personas(lista_personas);
        return mibiblioteca;

    }

    public static biblioteca alta_biblioteca() {
        Scanner sn = new Scanner(System.in);
        biblioteca mibiblioteca = new biblioteca();
        System.out.println("CREACION DE BIBLIOTECA");
        System.out.println("Dime el nombre de la biblioteca:");
        mibiblioteca.setNombre_biblioteca(sn.nextLine());
        System.out.println("Dime la direccion de la biblioteca:");
        mibiblioteca.setDireccion(sn.nextLine());
        System.out.println("Dime el id de la biblioteca:");
        mibiblioteca.setId_biblioteca(sn.nextInt());
        ArrayList<libro> lista_libro = new ArrayList<>();
        mibiblioteca.setLista_libro(lista_libro);
        ArrayList<usuario> lista_personas = new ArrayList<>();
        mibiblioteca.setLista_personas(lista_personas);
        
        return mibiblioteca;

    }

//METODO DAR DE ALTA LIBROS
    public static void dar_de_alta_libros(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                lista_libro.add(libro.crear_libro());
            } else {
                System.out.println("El id es incorrecto.");
            }
            encontrado = true;
        }
        if (encontrado == false) {
            System.out.println("No existe el id.");
        }
    }
    //METODO DAR DE ALTA PERSONA

    public static void dar_alta_persona(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                lista_personas.add(usuario.crear_persona());
            } else {
                System.out.println("El id es incorrecto.");
            }
            encontrado = true;
        }
        if (encontrado == false) {
            System.out.println("No existe el id.");
        }
    }

    // ESTADISTICAS BIBLIOTECA
    public void localizar_biblioteca() {
        System.out.println("______Biblioteca________");
        System.out.println("ID:" + this.id_biblioteca);
        System.out.println("Nombre:" + this.nombre_biblioteca);
        System.out.println("Direccion:" + this.direccion);
        System.out.println("Nº Total de libros prestados:" + libro.num_ejem_pres_glo);
        System.out.println("Nº Total de libros:" + libro.num_ejem_tot_glo);
        System.out.println("Nº Total de personal:" + biblioteca.lista_personas);
        System.out.println("___________________");
    }

    public static void pedir_localizar_biblioteca(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                a.get(i).localizar_biblioteca();
                encontrado=true;
            } else {
               i++;
            }
            
        }
    }

//CONSULTAR LIBRO    
    public static void pedir_localizar_libro(ArrayList<biblioteca> a) {
        libro.pedir_localizar_libro(lista_libro);
    }
//CONSULTAR LIBRO BIBLIOTECA

    public static void pedir_localizar_libro_biblioteca(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                libro.pedir_localizar_libro(lista_libro);
            } else {
                System.out.println("El id es incorrecto.");
            }
            encontrado = true;
        }
    }
//RESERVAR LIBRO 

    public static void pedir_reservar_libro_biblioteca(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                libro.pedir_prestar_libro(lista_libro);
            } else {
                System.out.println("El id es incorrecto.");
            }
            encontrado = true;
        }
    }
//DEVOLVER LIBRO

    public static void pedir_devolver_libro_biblioteca(ArrayList<biblioteca> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id de la biblioteca: ");
        int z = sn.nextInt();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getId_biblioteca() == z) {
                System.out.println("El id es correcto");
                libro.pedir_devolver_libro(lista_libro);
            } else {
                System.out.println("El id es incorrecto.");
            }
            encontrado = true;
        }
    }

}

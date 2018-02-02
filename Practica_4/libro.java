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
public class libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int num_ejem_pres;
    private int num_ejem_tot;
    static public int num_ejem_pres_glo;
    static public int num_ejem_tot_glo;
// CONSTRUCTOR VACIO

    public libro() {

    }
// CONSTRUCTOR CON PARAMETROS

    public libro(String titulo, String autor, String isbn, int ejempres, int ejemtot) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.num_ejem_pres = ejempres;
        this.num_ejem_tot = ejemtot;
        libro.num_ejem_tot_glo += this.num_ejem_tot;
    }

    //CONSTRUCTOR COPIA
    public libro(final libro copia) {
        titulo = copia.titulo;
        autor = copia.autor;
        isbn = copia.isbn;
        num_ejem_pres = 0;
        libro.num_ejem_tot_glo += this.num_ejem_tot;
    }
// GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNum_ejem_pres() {
        return num_ejem_pres;
    }

    public void setNum_ejem_pres(int num_ejem_pres) {
        this.num_ejem_pres = num_ejem_pres;
    }

    public int getNum_ejem_tot() {
        return num_ejem_tot;
    }

    public void setNum_ejem_tot(int num_ejem_tot) {
        this.num_ejem_tot = num_ejem_tot;
    }

    public static int getNum_ejem_pres_glo() {
        return num_ejem_pres_glo;
    }

    public static void setNum_ejem_pres_glo(int num_ejem_pres_glo) {
        libro.num_ejem_pres_glo = num_ejem_pres_glo;
    }

    public static int getNum_ejem_tot_glo() {
        return num_ejem_tot_glo;
    }

    public static void setNum_ejem_tot_glo(int num_ejem_tot_glo) {
        libro.num_ejem_tot_glo = num_ejem_tot_glo;
    }

// METODO CREAR LIBRO
    public static libro crear_libro() {
        Scanner p = new Scanner(System.in);
        libro milibro = new libro();
        System.out.println("CREACION DE LIBROS");
        System.out.println("Dime el titulo:");
        milibro.setTitulo(p.nextLine());
        System.out.println("Dime el autor:");
        milibro.setAutor(p.nextLine());
        System.out.println("Dime el isbn:");
        milibro.setIsbn(p.nextLine());
        System.out.println("Dime el numero de ejemplares totales:");
        milibro.setNum_ejem_tot(p.nextInt());
        milibro.setNum_ejem_pres(0);

        return milibro;
    }
//METODO PRESTAMO

    public boolean prestar_libro() {
        if (this.num_ejem_tot > this.num_ejem_pres) {
            this.num_ejem_pres++;
            libro.num_ejem_pres_glo++;
            return true;
        } else {
            return false;
        }
    }

    public static void pedir_prestar_libro(ArrayList<libro> z) {
        System.out.println("Dime que libro quieres coger prestado:");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        int i = 0;
        boolean encontrado = false;
        while ((i < z.size()) && (encontrado == false)) {
            if (z.get(i).getIsbn().equals(a)) {
                if (z.get(i).prestar_libro()) {
                    System.out.println("Has encontrado el libro y puedes cogerlo prestado.");
                } else {
                    System.out.println("Has encontrado el libro pero no hay ejemplares para prestar.");
                }
                encontrado = true;
            } else {
                i++;
            }
            if (encontrado == false) {
                System.out.println("No existe el libro que deseas.");
            }
        }

    }

    public boolean devolver_libro() {
        if (this.num_ejem_tot > this.num_ejem_pres) {
            this.num_ejem_pres--;
            libro.num_ejem_pres_glo--;
            return true;
        } else {
            return false;
        }
    }

    public static void pedir_devolver_libro(ArrayList<libro> z) {
        System.out.println("Dime que libro quieres devolver:");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        int i = 0;
        boolean encontrado = false;
        while ((i < z.size()) && (encontrado == false)) {
            if (z.get(i).getIsbn().equals(a)) {
                if (z.get(i).devolver_libro()) {
                    System.out.println("Has encontrado el libro y puedes cogerlo prestado.");
                } else {
                    System.out.println("Has encontrado el libro pero no hay ejemplares para prestar.");
                }
                encontrado = true;
            } else {
                i++;
            }
            if (encontrado == false) {
                System.out.println("No existe el libro que deseas.");
            }
        }

    }

    public void localizar_libro() {
        System.out.println("______LIBRO________");
        System.out.println("Titulo:" + this.getTitulo());
        System.out.println("Autor:" + this.getAutor());
        System.out.println("ISBN:" + this.getIsbn());
        System.out.println("Nº Total de ejemplares prestados:" + this.getNum_ejem_pres());
        System.out.println("Nº Total de ejemplares:" + this.getNum_ejem_tot());
        System.out.println("___________________");
    }

    public static void pedir_localizar_libro(ArrayList<libro> z) {
        System.out.println("Dime que libro quieres localizar:");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        int i = 0;
        boolean encontrado = false;
        while ((i < z.size()) && (encontrado == false)) {
            if (z.get(i).getIsbn().equals(a)) {
                System.out.println("Has encontrado el libro.");
                z.get(i).localizar_libro();
                encontrado = true;
            } else {
                i++;
            }
            if (encontrado == false) {
                System.out.println("No existe el libro que deseas.");
            }
        }

    }

}

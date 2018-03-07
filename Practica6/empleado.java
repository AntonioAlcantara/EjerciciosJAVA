/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class empleado {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario;

    public empleado() {
    }

    public empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void MostrarAtributos() {
        System.out.println("=====================");
        System.out.println("|Nombre:" + this.nombre + "|");
        System.out.println("|Apellidos:" + this.apellido1 + " " + this.apellido2 + "|");
        System.out.println("|NIF:" + this.nif + "|");
        System.out.println("|Edad:" + this.edad + "|");
        System.out.println("|Salario:" + this.salario + "|");
    }

    public void PedirAlta(ArrayList<empleado> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("|Nombre:");
        this.setNombre(sn.nextLine());
        System.out.println("|Primer apellido:");
        this.setApellido1(sn.nextLine());
        System.out.println("|Segundo apellido:");
        this.setApellido2(sn.nextLine());
        System.out.println("|NIF:");
        this.setNif(sn.nextLine());
        System.out.println("|Edad:");
        this.setEdad(sn.nextInt());
        System.out.println("|Salario:");
        this.setSalario(sn.nextDouble());
    }

    public static void pedir_MostrarAtributos(ArrayList<empleado> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el NIF del empleado: ");
        String z = sn.nextLine();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {
            if (a.get(i).getNif().equals(z)) {
                System.out.println("El id es correcto");
                a.get(i).MostrarAtributos();
                encontrado = true;
            } else {
                i++;
            }

        }
    }

}

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
public class repartidor extends empleado {

    private String zona;

    public repartidor() {
    }

    public repartidor(String zona) {
        this.zona = zona;
    }

    public repartidor(String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void MostrarAtributos() {
        super.MostrarAtributos();
        System.out.println("|Zona:" + this.zona + "|");
        System.out.println("=====================");
    }

    @Override
    public void PedirAlta(ArrayList<empleado> a) {
        Scanner sn = new Scanner(System.in);
        super.PedirAlta(a);
        System.out.println("|Zona:");
        this.setZona(sn.nextLine());
        System.out.println("=====================");

    }
}

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
public class comercial extends empleado {

    private double comision;

    public comercial() {

    }

    public comercial(String nombre, String apellido1, String apellido2, String nif, int edad, double salario, double comision) {
        super(nombre, apellido1, apellido2, nif, edad, salario);

    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void MostrarAtributos() {
        super.MostrarAtributos();
        System.out.println("|Comision:" + this.comision + "|");
        System.out.println("=====================");

    }

    @Override
    public void PedirAlta(ArrayList<empleado> a) {
        Scanner sn = new Scanner(System.in);
        super.PedirAlta(a);
        System.out.println("|Comision:");
        this.setComision(sn.nextDouble());
        System.out.println("=====================");

    }
}

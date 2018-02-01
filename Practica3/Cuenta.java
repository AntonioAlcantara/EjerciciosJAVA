/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Cuenta {

    private String NombreCliente;
    private String numerocuenta;
    private double tipointeres;
    private double saldo;

    public Cuenta() {

    }

    public Cuenta(String nombre, String cuenta, double interes, double saldo) {
        this.NombreCliente = nombre;
        this.numerocuenta = cuenta;
        this.saldo = saldo;
        this.tipointeres = interes;

    }

    public Cuenta(final Cuenta copia) {
        this.NombreCliente = copia.NombreCliente;
        this.numerocuenta = copia.numerocuenta;
        this.saldo = copia.saldo;
        this.tipointeres = copia.tipointeres;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getTipointeres() {
        return tipointeres;
    }

    public void setTipointeres(double tipointeres) {
        this.tipointeres = tipointeres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void datos() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente:");
        NombreCliente = datos.nextLine();
        System.out.println("Introduce el numero de cuenta:");
        numerocuenta = datos.nextLine();
        System.out.println("Introduce el tipo de interes:");
        tipointeres = datos.nextDouble();
        System.out.println("Introduce el saldo:");
        saldo = datos.nextDouble();

    }
//Metodo Ingreso
    public boolean Ingreso(double ingreso) {
        Scanner Ingreso = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres ingresar?:");
        ingreso = Ingreso.nextDouble();
        if (ingreso > 0) {
            this.saldo += ingreso;
            return true;
        } else {

            return false;
        }
    }
//metodo Reintegro
    public boolean Reintegro(double reintegro) {
        Scanner Reintegro = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres sacar?:");
        reintegro = Reintegro.nextDouble();
        if (reintegro < saldo) {
            this.saldo -= reintegro;
            return true;
        } else {
            System.out.println("No tienes tanto dinero macho <3");
            return false;
        }
    }

    //método transferencia
    public boolean transferencia(Cuenta CuentaDestino, double importe) {
        boolean correcto = true;
        if (importe < 0) {
            correcto = false;
        } else if (saldo >= importe) {
            Reintegro(importe);
            CuentaDestino.Ingreso(importe);
        } else {
            correcto = false;
        }
        return correcto;
    }

    // static public boolean Ingreso2(Cuenta c1,double ingreso) {
    //    if (ingreso > 0) {
    //         c1.saldo+=ingreso;
    //         return true;
    //     }else{
    //     return false;
    //     }
    // }
}

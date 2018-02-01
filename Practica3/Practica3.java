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
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cuenta cliente1 = new Cuenta();
        Cuenta cliente2 = new Cuenta();

        System.out.println("Introduce datos de cliente 1");
        cliente1.datos();
        System.out.println("Nombre: " + cliente1.getNombreCliente() + " Numero de cuenta: " + cliente1.getNumerocuenta()
                + " Tipo de Interes: " + cliente1.getTipointeres() + " Saldo: " + cliente1.getSaldo());
        System.out.println("Introduce datos de cliente 2");
        cliente2.datos();
        System.out.println("Nombre: " + cliente2.getNombreCliente() + " Numero de cuenta:" + cliente2.getNumerocuenta()
                + " Tipo de Interes: " + cliente2.getTipointeres() + " Saldo: " + cliente2.getSaldo());

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Sacar Dinero");
            System.out.println("3. Transferencia");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("Ingresa dinero al cliente1:");
                    cliente1.Ingreso(0);
                    System.out.println("Saldo actual: " + cliente1.getSaldo());
                    System.out.println("Ingresa dinero al cliente2:");
                    cliente2.Ingreso(0);
                    System.out.println("Saldo actual: " + cliente2.getSaldo());
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    System.out.println("Retira dinero al cliente1:");
                    cliente1.Reintegro(0);
                    System.out.println("Saldo actual: " + cliente1.getSaldo());
                    System.out.println("Retirar dinero al cliente2:");
                    cliente2.Reintegro(0);
                    System.out.println("Saldo actual: " + cliente2.getSaldo());
                    break;
                case 3:
                    Scanner transferir = new Scanner(System.in);
                    System.out.println(cliente1.getNombreCliente() + " ¿Qué cantidad quieres transferir de tu cuenta a la cuenta de " + cliente2.getNombreCliente() + "?");
                    double transferirdinero = transferir.nextDouble();
                    cliente1.transferencia(cliente2, transferirdinero);
                    System.out.println(cliente1.getNombreCliente() + " Ha transferido " + transferirdinero + " € a la cuenta de " + cliente2.getNombreCliente());
                    System.out.println("Saldo actual de " + cliente1.getNombreCliente() + " es: " + cliente1.getSaldo());
                    System.out.println("Saldo actual de " + cliente2.getNombreCliente() + " es: " + cliente2.getSaldo());

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }

}

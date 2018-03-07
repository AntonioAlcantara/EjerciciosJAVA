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
public class main {

    public static ArrayList<empleado> empleados = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("___________________________________");
            System.out.println("|1. Crear Empleado                |");
            System.out.println("|2. Crear Comercial               |");
            System.out.println("|3. Crear Repartidor              |");
            System.out.println("|4. Mostrar Atributos             |");
            System.out.println("|5. Salir                         |");
            System.out.println("___________________________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    empleado miempleado = new empleado();
                    miempleado.PedirAlta(empleados);
                    empleados.add(miempleado);
                    break;
                case 2:
                    System.out.println("OPCION 2");
                    comercial micomercial = new comercial();
                    micomercial.PedirAlta(empleados);
                    empleados.add(micomercial);
                    break;
                case 3:
                    System.out.println("OPCION 3");
                    repartidor mirepartidor = new repartidor();
                    mirepartidor.PedirAlta(empleados);
                    empleados.add(mirepartidor);
                    break;
                case 4:
                    System.out.println("OPCION 4");
                    empleado.pedir_MostrarAtributos(empleados);
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

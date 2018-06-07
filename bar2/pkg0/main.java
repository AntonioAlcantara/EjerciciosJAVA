/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *Es mi clase main donde inicio el programa del bar.
 * Contiene un menu donde puedes ser el cliente o 
 * el camarero.
 * @author Antonio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarjeta tarj = new Tarjeta(1111, 2000);
        Cliente antonio = new Cliente("Antonio", "Alcantara", tarj);
        Bar bar = new Bar();
        Camarero sara = new Camarero("Sara", "Muñoz", "Camarero", 2222);
        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println("==================");
            System.out.println("1. Cliente");
            System.out.println("2. Camarero");
            System.out.println("3. Salir.");
            System.out.println("==================");
            try {
                bar.generarCervezas();
               
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        bar.servicioBar(antonio, sara);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        bar.accederCamarero(sara);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 2");
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 3");

                }
            } catch (SQLException ex) {
                System.out.println("Estado BBDD: " + ex.getSQLState());
                System.out.println("Codigo de error: " + ex.getErrorCode());
            } catch (IOException e) {
                System.out.println("Error apertura o cierre: " + e.getCause());
            } catch (Exception exc) {
                System.out.println("Error no controlado. " + exc.getCause());
            }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;


import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws ejercicio2.excepcion
     */
    public static void main(String[] args) throws excepcion{
        // TODO code application logic here
        try {
            convertirenbase();
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }

    }

    public static void convertirenbase() throws excepcion {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("Dame un numero guapetón: ");
            int x = sn.nextInt();
            for (int i = 2; i <= 16; i++) {
                System.out.println("" + x + " en base " + i + " es " + Integer.toString(x, i));
            }
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }

}

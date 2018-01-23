/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void ejerciciojava6(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
        int[] tabla3 = new int[24];
        int a = 0;
        
        System.out.println("Dime la primera tabla: ");
        for (int i = 0; i < 12; i++) {
            System.out.println("Intoduce otro numero:");
            tabla1[i] = sc.nextInt();
        }
        System.out.println("Dime la segunda tabla: ");
        for (int i = 0; i < 12; i++) {
            System.out.println("Intoduce otro numero:");
            tabla2[i] = sc.nextInt();
        }
        for (int i = 0; i < 24; i += 4) {
            tabla3[i] = tabla1[a];
            a++;
        }
        for (int j = 0; j < 24; j += 4) {
            tabla3[j + 3] = tabla2[a];
            a++;
        }
        System.out.println("Tabla 3");
        for (int z = 0; z < 24; z++) {
            System.out.print(tabla3[z]);
        }
    }

}

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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void ejerciciojava5(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[20];
        int a = 0;
        int b = 0;
        System.out.println("Dime la primera tabla: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Intoduce otro numero:");
            tabla1[i] = sc.nextInt();
        }
        System.out.println("Dime la segunda tabla: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Intoduce otro numero:");
            tabla2[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i += 2) {
            tabla3[i] = tabla1[a];
            a++;
        }
        for (int j = 0; j < 20; j += 2) {
            tabla3[j + 1] = tabla2[b];
            b++;
        }
        for (int z = 0; z < 20; z++) {
            System.out.print("La tabla3 es: " + tabla3[z]);
        }
    }
}

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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void ejerciciojava2(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce 5 numeros:");
        
        int[] numero =new int[5];
        for(int i=0; i<5; i++){
		System.out.println("Introduce otro numero:");
                numero[i] = sc.nextInt();
	}
            for (int i = numero.length-1; i>=0; i--) {
            System.out.println(numero[i]+",");
        }
        
        
        

    }
    
}

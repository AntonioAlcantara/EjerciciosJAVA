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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void ejerciciojava4(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce 10 numeros:");
        
        int[] numero =new int[10];
        for(int i=0; i<10; i++){
                numero[i] = sc.nextInt();
                System.out.println("Introduce otro numero:");
	}
        
        System.out.println(numero[0]+","+numero[9]+","+numero[1]+","+numero[8]+","+numero[2]);
        
        
        
    }
    
}

package practica2;

import java.util.Scanner;


public class Main_Menu {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Ejercicio 1 \n2: Ejercicio 2 \n3: Ejercicio 3 \n4: Ejercicio 4 \n5: Ejercicio 5 \n6: Ejercicio 6");
        
        int ejercicio=entrada.nextInt();
        
        
        switch(ejercicio){
            case 1:
                Ejercicio1.ejercicio1();
                break;
         
            case 2:
                Ejercicio2.ejercicio2();
                break;
            
            case 3:
                Ejercicio3.ejercicio3();
                break;
         
            case 4:
                Ejercicio4.ejercicio4();
                break;
            
            case 5:
                Ejercicio5.ejercicio5();
                break;
         
            case 6:
                Ejercicio6.ejercicio6();
                break;
        }
    }
}
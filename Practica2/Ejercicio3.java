/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma*/
package practica2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3(){
        
        //introducir datos en el array bidimensional
        int num[][] = new int[3][3];
        int num2[][]= new int [3][3];
        int suma [][]= new int [3][3];
        
        //rellenamos el primer array
        Scanner numero = new Scanner(System.in);
        for(int i = 0; i < num.length; i++) {//llenammos las filas
            for(int j=0; j<num.length; j++){//llenamos las columnas
            System.out.println("Introduce un número");
            num[i][j] = numero.nextInt();
            }
        }
        
        //rellenamos el segundo array
        for(int i = 0; i < num2.length; i++) {//llenammos las filas
            for(int j=0; j<num2.length; j++){//llenamos las columnas
            System.out.println("Introduce un número");
            num2[i][j] = numero.nextInt();
            }
        }
        
        //sumamos las dos arrays e imprimimos la tabla
        for(int i=0;i<num.length;i++){
            System.out.println();
            for(int j=0;j<num.length;j++){
                suma[i][j]= num[i][j] + num2[i][j];
                System.out.print(suma[i][j]);
            }
        }
        
    }

}

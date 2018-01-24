/*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la
posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.*/
package practica2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejercicio1(){
        
        //introducir datos en el array bidimensional
        int num[][] = new int[5][5];
        Scanner numero = new Scanner(System.in);
        for(int i = 0; i < num.length; i++) {//llenammos las filas
            for(int j=0; j<num.length; j++){//llenamos las columnas
            System.out.println("Introduce un número");
            num[i][j] = numero.nextInt() + (i+j);
            }
        }
        //imprimimos la tabla
        for(int i=0;i<num.length;i++){
            System.out.println();
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }
        }
        
    }

}

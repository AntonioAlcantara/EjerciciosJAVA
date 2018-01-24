/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se
obtiene la misma tabla al cambiar filas por columnas.*/
package practica2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2(){
        int num[][] = new int[4][4];
        Scanner numero = new Scanner(System.in);
        int contador=0;
        for(int i = 0; i < num.length; i++) {//llenammos las filas
            for(int j=0; j<num.length; j++){//llenamos las columnas
            System.out.println("Introduce un número");
            num[i][j] = numero.nextInt();
            }
        }
        
        // cambiamos filas por columnas y comprobamos si es simétrica o no
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if (num[i][j]==num[j][i]) {
                    
                }else {
                    contador+=1;
		}
            }  
	}
        //imprime la tabla
        for(int i=0;i<num.length;i++){
            System.out.println();
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }
        }
        //imprime si es simétrica o no
	if (contador!=0) {
            System.out.println();
            System.out.println("No es una array simétrica");
	}else {
            System.out.println();
            System.out.println("Es una array simétrica");
	}
    }
}


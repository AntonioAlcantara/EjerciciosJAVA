/*Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado. Todos sus
elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz.*/
package practica2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejercicio6() {
        //decimos el tamaño de nuestra array
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas filas tendrá la tabla?");
        int fila = entrada.nextInt();
        System.out.println("¿Cuantas columnas tendrá la tabla?");
        int columna = entrada.nextInt();
        int[][] num = new int[fila][columna];

        //rellenamos el array "marco"
        for (int i=0;i<fila;i++) {
            for (int j=0;j<columna;j++) {
                if (i == 0 || i == fila - 1 || j == 0 || j == columna - 1) { // si nos encontramos en la primera o última columna, o fila
                    num[i][j] = 1;
                }
            }
        }

        //imprimimos el array
        for (int i=0;i<fila;i++) {
            System.out.println();
            for (int j=0;j<columna;j++) {
                System.out.print(num[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
}

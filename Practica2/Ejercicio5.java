/*Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los
de los bordes que deben ser 1. Mostrar la matriz.*/
package practica2;

public class Ejercicio5 {

    public static void ejercicio5() {
        int[][] num = new int[8][6];

        //rellena el array
        for (int i=0;i<num.length;i++) {
            for (int j=0;j<num[0].length;j++) {
                if(i==0 || i==7 || j==0 || j==5){ //primera o ultima columna o fila
                    num[i][j]=1;
                }
            }
        }

        //imprime el array
        for (int i=0;i<num.length;i++) {
            for (int j=0;j<num[0].length;j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }

    }

}

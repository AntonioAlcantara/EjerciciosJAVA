package practica2;

public class Ejercicio4 {
    public static void ejercicio4(){
        int[][] num = new int[7][7];
        
        //Solo se recorre el array cuando el número de fila es igual al número de columna
        for(int i=0 ; i<num.length; i++){
            num[i][i]=1;                           
        }
         
        //imprimimos el array
        for(int i=0 ; i<num.length; i++){
            System.out.println();
            for(int j=0; j<num.length; j++){
            System.out.print(num[i][j] +" ");
            }
        }
    }
}

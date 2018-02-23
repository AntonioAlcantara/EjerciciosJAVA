/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class llamarlibro {

    public static void menulibro() {
        Scanner sn = new Scanner(System.in);
        ArrayList<libro> lista_libro = new ArrayList<>();
        //libro prueba
        libro libro1 = new libro();
        libro1.setTitulo("Gris");
        libro1.setAutor("Antonio");
        libro1.setIsbn("001");
        libro1.setNum_ejem_pres(2);
        libro1.setNum_ejem_tot(100);
        lista_libro.add(libro1);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //lista_libro.add(libro.predeterminado_crear_libro("Don Quijote", "Cervantes", "001a", 20, 10));
        //lista_libro.add(libro.predeterminado_crear_libro("50 sombras de grey", "Masoka", "002a", 40, 20));
        //lista_libro.add(libro.predeterminado_crear_libro("La vida de Brian", "Jesucristo", "003a", 50, 9));
        //lista_libro.add(libro.predeterminado_crear_libro("Amante,esposo y cuñado", "", "004a", 10, 5));
        //lista_libro.add(libro.predeterminado_crear_libro("Cuñaismo avanzado", "Pablo Motos", "005a", 20, 0));
       // lista_libro.add(libro.predeterminado_crear_libro("Forocoches", "Electrik", "006a", 50, 3));
        //lista_libro.add(libro.predeterminado_crear_libro("Memedeportes", "Arbeloa", "007a", 100, 30));
        while (!salir) {
            System.out.println("_______________________");
            System.out.println("|1. Crear libro       |");
            System.out.println("|2. Prestar libro     |");
            System.out.println("|3. Devolver libro    |");
            System.out.println("|4. Localizar libro   |");
            System.out.println("|5. Salir             |");
            System.out.println("_______________________");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCION 1");
                    
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
                     
            }
            
        }
        
    }
}

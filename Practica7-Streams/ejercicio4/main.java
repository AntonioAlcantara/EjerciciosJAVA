/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Antonio
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws ejercicio4.excepcion
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws excepcion, FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        try {
            abrirfichero();
            leerobjeto();
        } catch (excepcion ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }

    public static void abrirfichero() throws excepcion, FileNotFoundException, ClassNotFoundException {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        try {
            archivo = new File("C:\\Users\\Antonio\\Desktop\\ejercicio4.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            leerarchivo(br);
        } catch (IOException | excepcion e) {
            //e.printStackTrace();//imprime pila de ejecución
            throw new excepcion("Error en la apertura del fichero", e.getCause());
        } finally {
            cerrarFichero(fr);
        }
    }

    public static void cerrarFichero(FileReader fr) {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {
        }
    }

    public static void leerarchivo(BufferedReader br) throws IOException, excepcion, FileNotFoundException, ClassNotFoundException {
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String vector[] = linea.split(" ");
            generarobjeto(vector, br);
        }
    }

    public static void generarobjeto(String vector[], BufferedReader br) throws excepcion, FileNotFoundException, IOException, ClassNotFoundException {
        try {
            File archivo = new File("prueba.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new persona(vector[0], vector[1], vector[2], vector[3], vector[4], vector[5], vector[6], vector[7], vector[8]));
            oos.close();

        } catch (Exception e) {
            throw new excepcion("Error en la creacion del objeto", e.getCause());
        }
    }

    public static void leerobjeto() throws excepcion, IOException, ClassNotFoundException {
        /*
  Alumno: Pepe García Hernández
------------------------------   -------
Módulo                            Nota
------------------------------   -------
Lenguaje de marcas         5
Programación                   7
Entornos de desarrollo     3
Base de datos                  7
Sistemas informáticos      10
FOL                                  c-5 */
        ObjectInputStream ois = null;
        try {
            File f = new File("prueba.txt");
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
                persona p = (persona) ois.readObject();
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Apellidos: " + p.getApellido1() + " " + p.getApellido2());
                System.out.println("Lenguaje de marcas: " + p.getLm());
                System.out.println("Programacion: " + p.getProg());
                System.out.println("Entornos de desarrollo: " + p.getEnd());
                System.out.println("Base de datos: " + p.getBd());
                System.out.println("Sistemas informaticos: " + p.getSi());
                System.out.println("FOL: " + p.getFol());
        } catch (IOException e) {
            throw new excepcion("Error en la lectura del objeto", e.getCause());
        } finally {
            ois.close();
        }
    }

}

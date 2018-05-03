/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Consulta");
            System.out.println("2. Update");
            System.out.println("3. Insert");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Consulta();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Update();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        insert();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número" + e.getMessage());
                sn.next();

            } catch (SQLException ex) {
                System.out.println("Mensaje de error: " + ex.getMessage());
                System.out.println("Mensaje de estado: " + ex.getSQLState());
                System.out.println("Nº error:" + ex.getErrorCode());
            }

        }
    }

    public static void Consulta() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "123456789");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from Beer");
        System.out.println("name--&---brewer");
        System.out.println("***********************");
        while (rs.next()) {
            String name = rs.getString("name");
            String brewer = rs.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");

    }

    public static void Update() throws SQLException {

        Scanner sn = new Scanner(System.in);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "123456789");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from Beer");
        System.out.println("name--&--brewer");
        System.out.println("***********************");
        while (rs.next()) {
            String name = rs.getString("name");
            String brewer = rs.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");
        System.out.println("Dime que columna quieres modificar: ");
        String columna = sn.nextLine();
        System.out.println("Dime que valor modificaras: (DEBE IR ENTRE COMILLAS 'valor') ");
        String nombre = sn.nextLine();
        System.out.println("Dime el valor nuevo: (DEBE IR ENTRE COMILLAS 'valor') ");
        String valor = sn.nextLine();
        if (columna == "name") {
            int update = st.executeUpdate("Update beer set " + columna + " = " + valor + " WHERE " + columna + " = " + nombre);
        } else {
            int update = st.executeUpdate("Update beer set " + columna + " = " + valor + " WHERE " + columna + " = " + nombre);
        }
        System.out.println("Ahora veras el valor actualizado: ");
        ResultSet resultado = st.executeQuery("Select * from Beer");
        System.out.println("name--&--brewer");
        System.out.println("***********************");
        while (resultado.next()) {
            String name = resultado.getString("name");
            String brewer = resultado.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");

    }

    public static void insert() throws SQLException {

        Scanner sn = new Scanner(System.in);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "123456789");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from Beer");
        System.out.println("name--&---brewer");
        System.out.println("***********************");
        while (rs.next()) {
            String name = rs.getString("name");
            String brewer = rs.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");
        System.out.println("Dame el nombre de la cerveza: (DEBE IR ENTRE COMILLAS 'valor')  ");
        String cerveza = sn.nextLine();
        System.out.println("Dime el nombre de la compañia: (DEBE IR ENTRE COMILLAS 'valor')  ");
        String compañia = sn.nextLine();
        int insert = st.executeUpdate("INSERT INTO beer (name,brewer) VALUES (" + cerveza + "," + compañia + ")");
        ResultSet resultado = st.executeQuery("Select * from Beer");
        System.out.println("name--&---brewer");
        System.out.println("***********************");
        while (resultado.next()) {
            String name = resultado.getString("name");
            String brewer = resultado.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");

    }
}

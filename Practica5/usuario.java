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
public class usuario {

    private String nombre;
    private String apellidos;
    private String dni;
    private String cargo;
    private String contraseña;
    private String nombreusuario;

    public usuario() {
    }

    public usuario(String nombre, String apellidos, String dni, String cargo, String contraseña, String usuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cargo = cargo;
        this.contraseña = contraseña;
        this.nombreusuario = usuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static usuario predeterminado_crear_persona(String dni, String nombre, String apellidos, String cargo, String usuario, String contraseña) {
        usuario persona = new usuario();
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setCargo(cargo);
        persona.setNombreusuario(usuario);
        persona.setContraseña(contraseña);

        return persona;
    }
//METODO CREAR PERSONA
    public static usuario crear_persona() {
        Scanner sn = new Scanner(System.in);
        usuario persona = new usuario();
        System.out.println("Dime el dni:");
        persona.setDni(sn.nextLine());
        System.out.println("Dime el nombre:");
        persona.setNombre(sn.nextLine());
        System.out.println("Dime los apellidos:");
        persona.setApellidos(sn.nextLine());
        System.out.println("Dime el cargo:");
        persona.setCargo(sn.nextLine());
        System.out.println("Dime el nombre de usuario:");
        persona.setNombreusuario(sn.nextLine());
        System.out.println("Dime la contraseña:");
        persona.setContraseña(sn.nextLine());
        return persona;
    }

    //METODO VALIDAR USUARIO
    public static void validar_usuario(ArrayList<usuario> a) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el nombre de usuario:");
        String z = sn.nextLine();
        int i = 0;
        boolean encontrado = false;
        while ((i < a.size()) && (encontrado == false)) {//RECORRO LA LISTA DE PERSONAS PARA ENCONTRAR EL NOMBRE DE USUARIO
            if (a.get(i).getNombreusuario().equals(z)) {
                System.out.println("El nombre de usuario es correcto");
                System.out.println("Dime la contraseña del usuario:");
                String x = sn.nextLine();
                while ((i < a.size()) && (encontrado == false)) {//RECORRO LA LISTA DE PERSONAS PARA ENCONTRAR LA CONTRASEÑA
                    if (a.get(i).getContraseña().equals(x)) {
                        System.out.println("La contraseña de usuario es correcta");
                        //SI LA CONTRASEÑA ES CORRECTA TE ENVIA AL MENU DE BIBLIOTECA
                        main.menubiblioteca();
                    } else {
                        System.out.println("La contraseña de usuario no es correcta");
                    }
                    encontrado = true;
                }
                if (encontrado == false) {
                    System.out.println("No existe la contraseña.");
                }
            } else {
                System.out.println("El nombre de usuario no es correcto");
            }
            encontrado = true;
        }
        if (encontrado == false) {
            System.out.println("No existe el usuario.");
        }

    }

}

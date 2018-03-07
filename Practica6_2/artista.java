/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6_2;

/**
 *
 * @author Antonio
 */
public class artista {
    private String nombre;
    private String apellidos;
    private int añonacimiento;
    private String lugarnacimiento;

    public artista() {
    }

    public artista(String nombre, String apellidos, int añonacimiento, String lugarnacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.añonacimiento = añonacimiento;
        this.lugarnacimiento = lugarnacimiento;
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

    public int getAñonacimiento() {
        return añonacimiento;
    }

    public void setAñonacimiento(int añonacimiento) {
        this.añonacimiento = añonacimiento;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }
    
}

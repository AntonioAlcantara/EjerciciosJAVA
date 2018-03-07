/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6_2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class obra {
    private String nombre;
    private Date fecha;
    private int id;
    public ArrayList<artista> artistas;

    public obra() {
    }

    public obra(String nombre, Date fecha, int id, ArrayList<artista> artistas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id++;
        this.artistas = artistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<artista> artistas) {
        this.artistas = artistas;
    }
    public void MostrarAtributos(){
        System.out.println("================");
        System.out.println("Nombre"+this.nombre);
        System.out.println("ID:"+this.id);
        System.out.println("Fecha:"+this.fecha);
        System.out.println("N");
    
    
    }
}


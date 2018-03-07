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
public class pinturas extends obra {
    private double ancho;
    private double alto;
    private double precio;

    public pinturas() {
    }

    public pinturas(double ancho, double alto, double precio, String nombre, Date fecha, int id, ArrayList<artista> artistas) {
        super(nombre, fecha, id, artistas);
        this.ancho = ancho;
        this.alto = alto;
        this.precio = precio;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public ArrayList<artista> getArtistas() {
        return artistas;
    }

    @Override
    public void setArtistas(ArrayList<artista> artistas) {
        this.artistas = artistas;
    }
    
}

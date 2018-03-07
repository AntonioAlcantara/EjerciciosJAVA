/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6_2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class musical extends obra {
    private Time duracion;
    private int numerocanciones;
    private double preciocd;
    private double preciovinilo;
    public musical() {
    }

    public musical(Time duracion,int numerocanciones ,double preciocd, double preciovinilo, String nombre, Date fecha, int id, ArrayList<artista> artistas) {
        super(nombre, fecha, id, artistas);
        this.duracion = duracion;
        this.numerocanciones = numerocanciones;
        this.preciocd = preciocd;
        this.preciovinilo = preciovinilo;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }
    public int getNumerocanciones() {
        return numerocanciones;
    }

    public void setNumerocanciones(int numerocanciones) {
        this.numerocanciones = numerocanciones;
    }

    public double getPreciocd() {
        return preciocd;
    }

    public void setPreciocd(double preciocd) {
        this.preciocd = preciocd;
    }

    public double getPreciovinilo() {
        return preciovinilo;
    }

    public void setPreciovinilo(double preciovinilo) {
        this.preciovinilo = preciovinilo;
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

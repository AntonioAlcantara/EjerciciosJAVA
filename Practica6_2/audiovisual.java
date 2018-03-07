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
public class audiovisual extends obra{
    private Time duracion;
    private double preciodvd;
    private double preciobluray;

    public audiovisual() {
    }

    public audiovisual(Time duracion, double preciodvd, double preciobluray, String nombre, Date fecha, int id, ArrayList<artista> artistas) {
        super(nombre, fecha, id, artistas);
        this.duracion = duracion;
        this.preciodvd = preciodvd;
        this.preciobluray = preciobluray;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public double getPreciodvd() {
        return preciodvd;
    }

    public void setPreciodvd(double preciodvd) {
        this.preciodvd = preciodvd;
    }

    public double getPreciobluray() {
        return preciobluray;
    }

    public void setPreciobluray(double preciobluray) {
        this.preciobluray = preciobluray;
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

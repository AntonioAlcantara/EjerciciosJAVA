/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

/**
 *Clase que contiene los parametros para generar la cuenta.
 * @author Antonio
 */
public class Cuenta {
    String nombre;
    int cantidad_comprada;
    double preciototal;

    public Cuenta() {
    }

    public Cuenta(String nombre, int cantidad_comprada, double preciototal) {
        this.nombre = nombre;
        this.cantidad_comprada = cantidad_comprada;
        this.preciototal = preciototal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_comprada() {
        return cantidad_comprada;
    }

    public void setCantidad_comprada(int cantidad_comprada) {
        this.cantidad_comprada = cantidad_comprada;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }
    
}

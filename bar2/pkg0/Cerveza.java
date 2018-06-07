/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

/**
 *Este es nuestra clase Cerveza que utilizamos para crear las cervezas.
 * @author Antonio
 */
public class Cerveza {
    private String nombre;
    private String industria;
    private int cantidad;
    private double precio;

    public Cerveza() {
    }

    public Cerveza(String nombre, String industria, int cantidad, double precio) {
        this.nombre = nombre;
        this.industria = industria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 /**
 *Metodo utilizado para poder ver los datos de Cerveza. 
 */
    public void mostrarCerveza(){
        System.out.println("********************************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Industria: "+this.industria);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Precio: "+this.precio+" $");
        System.out.println("********************************");
    }
}

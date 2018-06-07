/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

/**
 *Clase heredada de Persona donde es un Camarero 
 * que contiene un cargo y su contraseña.
 * @author Antonio
 */
public class Camarero extends Persona{
    private String profesion;
    private int contraseña;
    public Camarero() {
    }

    public Camarero (String nombre, String apellido,String profesion,int contraseña) {
        super(nombre, apellido);
        this.profesion = profesion;
        this.contraseña=contraseña;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    /**
 * Metodo heredado para ver los datos.
 */
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Cargo: "+this.profesion); 
    
    }
    
}

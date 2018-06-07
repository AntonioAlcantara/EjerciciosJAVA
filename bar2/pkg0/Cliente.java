/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

/**
 *Clase heredada de Persona donde añadimos el parametro tarjeta.
 * @author Antonio
 */
public class Cliente extends Persona{
    private Tarjeta tarjeta;

    public Cliente(String nombre, String apellido,Tarjeta tarjeta) {
        super(nombre, apellido);
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
  /**
 * Metodo heredado de persona donde muestra los datos.
 */
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Saldo Tarjeta: "+this.tarjeta.getSaldo());
    
    }
}

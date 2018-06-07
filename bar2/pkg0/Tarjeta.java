/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

/**
 *Este clase contiene los parametos de nuestra tarjeta.
 * @author Antonio
 */
public class Tarjeta {
    private int pin;
    private double saldo;

    public Tarjeta() {
    }

    public Tarjeta(int pin, double saldo) {
        this.pin = pin;
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 /**
 *Metodo con el que disminuiremos el saldo de la tarjeta. 
 */
    public void disminuirSaldo(double importe) {
        this.saldo -= importe;
    }
/**
 * Metodo que comprueba el Saldo. 
 */
    public boolean comprobarSaldo(double importe) {
        return (this.saldo>= importe);
    }
    
}

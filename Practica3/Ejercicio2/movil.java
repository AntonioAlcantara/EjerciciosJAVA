/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class movil {

    private String contacto;
    private int numero;
    private ArrayList<String> mensaje = new ArrayList<>();
    private ArrayList<String> apps = new ArrayList<>();

    public movil() {
    }

    public movil(String nombre, int numero, ArrayList<String> sms, ArrayList<String> app) {
        this.contacto = nombre;
        this.numero = numero;
        this.mensaje = sms;
        this.apps = app;
    }

    public movil(final movil copia) {
        this.contacto = copia.contacto;
        this.numero = copia.numero;
        this.mensaje = copia.mensaje;
        this.apps = copia.apps;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<String> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<String> mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<String> getApps() {
        return apps;
    }

    public void setApps(ArrayList<String> apps) {
        this.apps = apps;
    }
// Metodo contacto

// Metodo DejarMensaje
    //  public void dejarmensaje() {
    //    Scanner sc = new Scanner(System.in);
    //  this.contacto=sc.nextLine();
    /// System.out.println("Escribe un mensaje "+contacto);
    // mensaje = sc.nextLine();
    // }
    public void mensajes() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escribe una nota:");
            String sms = sc.nextLine();
            mensaje.add(sms);
        

    }

//Metodo Descargar apps  
    public void aplicaciones() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> storeapps = new ArrayList<String>();

        storeapps.add("Telegram");
        storeapps.add("Plusdede");
        storeapps.add("Instagram");
        storeapps.add("Facebook");
        storeapps.add("YouTube");
        storeapps.add("Snapchat");
        System.out.println("¿Que app quieres descargar?");
        for (int i = 0; i <= storeapps.size() - 1; i++) {
            System.out.println(storeapps.get(i));
        }
        System.out.println("Elige una:");
        String app = sc.nextLine();
        if (storeapps.contains(app)) {
            System.out.println("Has seleccionado " + app);
            if (apps.contains(app)) {
                System.out.println("Ya tienes esta app.");
            } else {
                apps.add(app);
                System.out.println("Estan son tus apps:");
                for (int i = 0; i <= apps.size() - 1; i++) {
                    System.out.println(apps.get(i));
                }
            }
        } else {
            System.out.println("No existe esa app.");
        }
    }

}

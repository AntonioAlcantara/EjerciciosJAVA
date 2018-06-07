/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar2.pkg0;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Esta clase es la principal ya que contiene la estructura del servicio que ofrece el bar.
 * Contiene uso de base de datos y ficheros 
 * @author Antonio
 */

public class Bar {

    private String nombre;
    private ArrayList<Cerveza> beer;

    public Bar() {
    }

    public Bar(String nombre, ArrayList<Cerveza> beer) {
        this.nombre = nombre;
        this.beer = beer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cerveza> getBeer() {
        return beer;
    }

    public void setBeer(ArrayList<Cerveza> beer) {
        this.beer = beer;
    }
/**
 * Metodo que genera objetos a partir de la base de datos. 
 * Gracias a este metodo consigo crear las cervezas con todos sus datos.
 */
    public void generarCervezas() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cerveza", "root", "123456789");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select * from cervezas;");) {

            ArrayList<Cerveza> listacerveza = new ArrayList();
            while (rs.next()) {
                String nombre = rs.getString(1);
                String industria = rs.getString(2);
                int cantidad = rs.getInt(3);
                double precio = rs.getInt(4);
                listacerveza.add(new Cerveza(nombre, industria, cantidad, precio));
            }
            this.beer = listacerveza;
        } catch (SQLException e) {
            System.out.println("Codigo de error: " + e.getErrorCode());
        }
    }
/**
 * Metodo que utilizo para mostrar la lista de cervezas que tengo.
 */
    public void cartaBar() {
        System.out.println("****Carta de Cervezas****");
        for (Cerveza beer : this.getBeer()) {
            beer.mostrarCerveza();
        }
    }
/**
 * Este metodo contiene el servicio al cliente,
 * donde puede pedir una o más cervezas y luego puede pagar la cuenta.
 */
    public void servicioBar(Cliente c, Camarero p) throws IOException, SQLException {
        ArrayList<Cuenta> ticket = new ArrayList();
        Scanner sn = new Scanner(System.in);
        int opcion;
        int cantidad;
        double precio_final = 0;
        boolean salir = false;
        boolean encontrado = false;
        String eleccion = null;
        while (!salir) {
            System.out.println(this.nombre = "Bar Alcantara");
            System.out.println("Buenas, le atiende "+p.getNombre());
            System.out.println("==================");
            System.out.println("1. Desea tomar algo?");
            System.out.println("2. Mirar tu cartera.");
            System.out.println("3. Pagar la cuenta.");
            System.out.println("4. Salir.");
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        cartaBar();
                        while (!"no".equals(eleccion)) {
                            System.out.println("=================");
                            System.out.println("Digame que cerveza desea tomar.(Si no desea tomar nada más diga no.)");
                            eleccion = sn.next();
                            for (Cerveza beer : this.getBeer()) {
                                if (beer.getNombre().equals(eleccion)) {
                                    encontrado = true;
                                    System.out.println("Dime cuantas cervezas quieres beberte.");
                                    cantidad = sn.nextInt();
                                    if (cantidad <= beer.getCantidad() && cantidad > 0) {
                                        beer.setCantidad(beer.getCantidad() - cantidad);
                                        precio_final += (cantidad * beer.getPrecio());
                                        ticket.add(new Cuenta(beer.getNombre(), cantidad, (cantidad * beer.getPrecio())));
                                        restarCantidad(cantidad, eleccion);
                                        System.out.println("Te pongo las cervezas a tu cuenta.");
                                    } else {
                                        System.out.println("No dispongo de tanta cerveza, Animal!");
                                    }
                                }
                            }
                            if (encontrado == false) {
                                System.out.println("No tenemos esa cerveza.");
                            }
                        }
                        if (precio_final != 0 && !ticket.isEmpty()) {
                            System.out.println("Aqui tienes la cuenta.");
                            mostrarTicket(ticket, precio_final);
                            generarTicket(ticket, precio_final);
                        }

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        c.mostrarDatos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 2");
                        pagarCuenta(ticket, c, precio_final);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 3");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
/**
 * En este metodo genero el ticket de la cuenta en un fichero txt.
 */
    public void generarTicket(ArrayList<Cuenta> ticket, double preciofinal) throws IOException {
        try {
            File archivo = new File("ticket.txt");
            FileWriter ar = new FileWriter(archivo);
            BufferedWriter br = new BufferedWriter(ar);
            //PrintWriter ar = new PrintWriter(fw);
            br.write("******TICKET**********");
            for (Cuenta c : ticket) {
                br.newLine();
                br.write("Producto: " + c.nombre);
                br.newLine();
                br.write("Cantidad: " + c.getCantidad_comprada());
                br.newLine();
                br.write("Precio Total: " + c.preciototal + " $");
            }
            br.newLine();
            br.write("Total: " + preciofinal + " $");
            br.newLine();
            br.write("*************************");
            br.newLine();
            br.close();
            ar.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
/**
 * Con este metodo enseño por pantalla los datos del ticket de la cuenta.
 */
    public void mostrarTicket(ArrayList<Cuenta> ticket, double preciofinal) {

        System.out.println("******TICKET**********");
        for (Cuenta c : ticket) {
            System.out.println("Producto: " + c.nombre);
            System.out.println("Cantidad: " + c.getCantidad_comprada());
            System.out.println("Precio Total: " + c.preciototal + " $");
        }
        System.out.println("Total: " + preciofinal + "$");
        System.out.println("*************************");

    }
/**
 * Con este metodo el cliente puede pagar la cuenta.
 */
    public void pagarCuenta(ArrayList<Cuenta> ticket, Cliente cliente, double preciofinal) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dame el PIN de la tarjeta.");
        int pin = sn.nextInt();
        if (cliente.getTarjeta().getPin() == pin) {
            if (cliente.getTarjeta().comprobarSaldo(preciofinal)) {
                cliente.getTarjeta().disminuirSaldo(preciofinal);
                System.out.println("Se ha realizado con exito el pago.");
            } else {
                System.out.println("No tienes saldo, te voy a partir la cabeza.");
            }
        } else {
            System.out.println("PIN incorrecto.");
        }

    }
/**
 * Metodo que resta la cantidad de cerveza que haya consumido el cliente
 * en la base de datos
 */
    public void restarCantidad(int cantidad, String cerveza) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cerveza", "root", "123456789");
                Statement st = con.createStatement();) {
            con.setAutoCommit(false);
            st.executeUpdate("UPDATE cervezas SET  Cantidad = Cantidad -" + cantidad + " WHERE nombre LIKE '"+ cerveza +"';");
            con.commit();
            con.setAutoCommit(true);
        } catch (SQLException ex) {
            ex.getErrorCode();
            
        }

    }
/**
 * Metodo que contiene el servicio del camarero que puede recargar la bodega
 * cuando necesite más cerveza.
 */
    public void servicioCamarero(Camarero p) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Recargar la bodega.");
            System.out.println("2. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
/**
 * Metodo que identifica al camarero.
 */
    public void accederCamarero(Camarero p) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dame tu nombre: ");
        String nombre = sn.nextLine();
        try {
            if (p.getNombre().equals(nombre)) {
                System.out.println("Nombre correcto.");
                System.out.println("Dime la contraseña: ");
                int contraseña = sn.nextInt();
                if (p.getContraseña() == contraseña) {
                    System.out.println("Contraseña correcta.");
                    recargarBodega();
                } else {
                    System.out.println("Contraseña incorrect.");
                }
            } else {
                System.out.println("Ese nombre no existe.");
            }
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error " + ex.getCause());
        }

    }
/**
 * Metodo utilizado para recargar la bodega en la base de datos.
 */
    public void recargarBodega() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cerveza", "root", "123456789");
                Statement st = con.createStatement();) {
            con.setAutoCommit(false);
            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            cartaBar();
            while (!salir) {
                System.out.println("Dime la cerveza que quieres recargar: ");
                String nombrecerveza = sn.next();

                System.out.println("Dime la cantidad del pedido : ");
                int cantidad = sn.nextInt();

                st.executeUpdate("UPDATE cervezas SET  Cantidad =Cantidad+" + cantidad
                        + " WHERE nombre LIKE '" + nombrecerveza + "';");

                System.out.println("¿Quieres pedir mas?(Para salir di no)");
                String respuesta = sn.next();
                if ("no".equals(respuesta)) {
                    salir = true;
                }
            }
            con.commit();
            con.setAutoCommit(true);

        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error con la BBDD: " + e.getSQLState());
        }

    }

}

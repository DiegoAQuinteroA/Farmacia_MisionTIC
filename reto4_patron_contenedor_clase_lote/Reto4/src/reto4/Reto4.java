/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author Diego
 */
public class Reto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lote l = new Lote();
        l.agregarProducto(new ProductoNoRefrigerado("Acetaminofen", "123456", 25, 1000) );
        l.agregarProducto(new ProductoNoRefrigerado("Dolex", "654321", 25, 2000) );
        l.agregarProducto(new ProductoRefrigerado("Vacuna covid", "98547", 0, 5000) );
        l.mostrarProductos();
    }
    
}

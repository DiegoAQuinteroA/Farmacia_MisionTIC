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
public class ProductoNoRefrigerado extends Producto {

    //contructor
    public ProductoNoRefrigerado(String nombre, String id, double tempreratura, double valorBase) {
        super(nombre, id, tempreratura, valorBase);
    }

    public ProductoNoRefrigerado() {
    }
    
    //metodos
    @Override
    public double calcularCostoAlmacenamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class ProductoRefrigerado extends Producto {

    //constructor
    public ProductoRefrigerado(String nombre, String id, double tempreratura, double valorBase) {
        super(nombre, id, tempreratura, valorBase);
    }

    public ProductoRefrigerado() {
    }

    //metodos
    @Override
    public double calcularCostoAlmacenamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

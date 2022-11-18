/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3_productonorefrigerado;

/**
 *
 * @author Diego
 */
public class ProductoNoRefrigerado extends Producto{
    
    //contructor
    public ProductoNoRefrigerado(String nombre, String id, double tempreratura, double valorBase){
        super(nombre, id, tempreratura, valorBase);
    }

    public ProductoNoRefrigerado() {    
    }

    //metodos
    public double calcularCostoDeAlmacenamiento() {
        double costoAlmacenamiento = 0;
        
        costoAlmacenamiento = this.getValorBase()*1.10;
        
        return costoAlmacenamiento;
    }
    
    
}

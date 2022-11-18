/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Lote {
    private List<Producto> productos;

    public Lote() {
        this.productos = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    public void mostrarProductos(){
        for(Producto producto : productos)
            //System.out.println(producto);
            System.out.println(producto.getNombre() + "," + producto.getId() + "," + producto.getTempreratura() + "," + producto.getValorBase());
    }
}

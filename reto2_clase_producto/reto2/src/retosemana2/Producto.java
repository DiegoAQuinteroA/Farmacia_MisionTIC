/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosemana2;

/**
 *
 * @author Diego
 */
public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;

    public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
        this.cotizante = cotizante;
    }
    
    public float costo(){
        float cuotaModeradora = 0;
        
        if (this.cotizante){
            cuotaModeradora += 3500f;
        }
        else{
            cuotaModeradora += 14000f;
        }
        return cuotaModeradora;
    }
    public void info() {
     System.out.println("[Producto]:");   	 
     System.out.println("Nombre:" +this.nombre);
     System.out.println("Codigo: " + this.codigo);
     System.out.println("Categoria: " + this.categoria);
     System.out.println("Laboratorio: " + this.laboratorio);
     System.out.println("Precio: " + this.costo());
    }
    
}

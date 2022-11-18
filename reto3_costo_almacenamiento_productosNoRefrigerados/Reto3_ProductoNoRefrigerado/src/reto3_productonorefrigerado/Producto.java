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
public class Producto {
    //atributos
    private String nombre;
    private String id;
    private double tempreratura;
    private double valorBase;
    
    //constructor
    public Producto(String nombre, String id, double tempreratura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.tempreratura = tempreratura;
        this.valorBase = valorBase;
    }

    public Producto() {
    }
    
    //get an set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTempreratura() {
        return tempreratura;
    }

    public void setTempreratura(double tempreratura) {
        this.tempreratura = tempreratura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    
    //metodos
    
}

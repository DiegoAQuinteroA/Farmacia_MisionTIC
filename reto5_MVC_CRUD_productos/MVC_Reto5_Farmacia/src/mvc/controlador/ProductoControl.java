
package mvc.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mvc.modelo.ProductoModel;
import mvc.modelo.Conexion;

public class ProductoControl {
    //consulta - select
    public ArrayList<ProductoModel> listarProducto(){
        ArrayList<ProductoModel> listaProducto = new ArrayList();
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM producto ORDER BY id";

        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                ProductoModel producto = new ProductoModel(rs.getString("nombre"), rs.getString("id"),rs.getDouble("temperatura"), rs.getDouble("valorBase"));
                listaProducto.add(producto);
            }
        } catch (SQLException e) {
        }
        return listaProducto;
    }
    
    //agregar producto
    public String agregarProducto(String nombre, String id, double temperatura, double valorBase){
        
        String mensaje="";
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM Producto where id=" + id;
        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
               mensaje="Producto YA existe"; 
            }
            else{
                 sql = "INSERT INTO Producto(nombre,id,temperatura,valorBase) values('"+nombre+"','"+id+"','"+temperatura+"','"+valorBase+"')";
                 stm = conn.getCon().createStatement();
                 stm.executeUpdate(sql); 
                 mensaje="Producto agregado";
            }
            
        } catch (SQLException e) {
        }

        return mensaje;
    }
    
    //eliminar producto
    public String eliminarProducto(String id){
        String mensaje="";
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM producto where id="+id;
        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
                 sql = "DELETE from producto where id="+id;
                 stm = conn.getCon().createStatement();
                 stm.executeUpdate(sql); 
                 mensaje="Producto eliminado";
                
            }
            else{
                 mensaje="Producto NO existe";
            }
            
        } catch (SQLException e) {
        }
        
        return mensaje;
    }
    
    //modifcar producto
    public String modificarProducto(String nombre, String id, double temperatura, double valorBase){
        String mensaje="";
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM producto where id="+id;
        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
                 sql = "UPDATE producto SET nombre='"+nombre+"', temperatura='"+temperatura+"',valorBase='"+valorBase+"' WHERE id="+id;
                 stm = conn.getCon().createStatement();
                 stm.executeUpdate(sql); 
                 mensaje="Producto modificado";
            }
            else{
                 mensaje="Producto NO existe"; 
            }
            
        } catch (SQLException e) {
        }
        
        return mensaje;
    }
}

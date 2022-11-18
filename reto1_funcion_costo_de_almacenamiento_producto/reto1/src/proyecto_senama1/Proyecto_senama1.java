/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_senama1;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Proyecto_senama1 {

    /**
     * @param args the command line arguments
     */
    
    static float calcularCostoAlmacenamiento(boolean refigerado, float valorBase){
            float precio_almacenamiento = 0;
            
            /*
            no es necesario colocar refrijerado==true, 
            ya que solo tenemos un solo if este lo toma cm verdader0
            */
            if (refigerado ){
                precio_almacenamiento = valorBase * 1.30f;
            }
            else{
                precio_almacenamiento = valorBase * 1.15f;
            }
            return precio_almacenamiento;
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consol = new Scanner(System.in);
        
        System.out.println(calcularCostoAlmacenamiento(true,100));
        System.out.println(calcularCostoAlmacenamiento(false,100));
    }
    
}

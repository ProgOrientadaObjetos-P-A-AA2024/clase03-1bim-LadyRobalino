/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Militar");
        h3.establecerNombre("Manuel IM");
        
        /*
        El System nos imprime la variable h1.obtenerNombre(); el ".obtenerNombre() 
        recibe el valor que le dimos en .establecerNombre(), en este caso le 
        dimos el valor tipo cadena "Vaca Ortiz", y los otros dos 
        obtener como no establecimos un valor anteriormente por defecto lo 
        inicializa con cero, y lo que esta comentado lo usamos con el printf le 
        decimos que primero nos imprima el tipo cadena, entero y al final el 
        decimal con 2 num despues del coma y por ultimo un salto de linea.       
        */
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        /*
        h1.establecerNombre("Hospital Vaca Ortíz");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.println("------------------");
        
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        */
        
    }
}

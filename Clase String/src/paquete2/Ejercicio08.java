/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String texto= "Tomates verdes fritos";
       char x[]=new char[texto.length()];
       for (int i = 0; i <texto.length(); i++) {
            x[i]=texto.charAt(texto.length()-(i+1));
        }
       
       String textoInvertido= new String(x);
        System.out.println("Texto: "+texto);
        System.out.println("Y el invertido : "+textoInvertido);
    }
}

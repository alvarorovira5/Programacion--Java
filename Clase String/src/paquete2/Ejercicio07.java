/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="Una frase con una p";
       int v[]=new int[texto.length()];
       
       
       int posi= texto.lastIndexOf('p');
       if(posi==-1){
           System.out.println("No hay ninguna p");
       }
       else{
           System.out.println("Al menos hay una en la posicion: "+posi);
       }
       
    }
}

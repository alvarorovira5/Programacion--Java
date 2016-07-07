/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto= "En mi proxima vida, creere en la reencarnacion";
        
        if(texto.indexOf("creere")==-1){
            System.out.println("creere no se encuentra en: "+texto);
        }
        else{
            System.out.println("creere esta en: "+texto);
        }
    }
}

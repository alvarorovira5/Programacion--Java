/*
 * Introducir un texto, muéstrala de nuevo sin espacios en blanco.
 */
package paquete2;
import paquete1.*;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="Buenos días, soy Álvaro de YECLA (MURCIA).";
        //Trim elimina los espacios en blanco al principio y al final de la frase.
        // bb las manzanas estan verdes bb
        System.out.println(MyClaseString.sinEspacios(texto));
    }
}

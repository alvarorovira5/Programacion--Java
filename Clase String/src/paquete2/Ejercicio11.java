/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.MyClaseString;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * 1º Pasar a mayusculas.
         * 2º Quitar los espacios.
         * 3º Invertir el texto.
         */
        String texto="ana";
        
        texto.toUpperCase();
        
        texto=MyClaseString.sinEspacios(texto);
        
        String textoInvertido=MyClaseString.invertir(texto);
        
        if(texto.equals(textoInvertido)==true){
            System.out.println("Una frase Palindroma");
        }
        else{
            System.out.println("No es una frase Palindroma.");
        }
    }
}

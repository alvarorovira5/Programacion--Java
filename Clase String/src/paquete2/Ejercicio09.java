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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String abecedario="ABCDEFGHIJKLMNÑOPQRSTUVW";
        String texto="Ricardito";//
        texto=texto.toUpperCase();
       
        
        if(MyClaseString.comprobarPalabra(texto)){
            System.out.println(texto+" es una palabra.");
        }
        else{
            System.out.println(texto+ " No es una palabra.");
        }
    }
}

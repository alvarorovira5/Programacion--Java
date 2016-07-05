/*
 * Programa que lee una cantidad en euros y la cotización del Euro en dólares, 
 * calcula y muestra la equivalencia de dicha cantidad en Euros y dólares.
 * 
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        float euros,cotizacion€_$,dolares;
        
        System.out.println("¿Cuántos euros quieres cambiar?");
        
        cad=teclado.nextLine();
        euros=Float.parseFloat(cad);
        
        System.out.println("¿Cual es la equivalencia de euros a dolares?");
        cad=teclado.nextLine();
        cotizacion€_$=Float.parseFloat(cad);
        
        dolares=cotizacion€_$*euros;
        System.out.println("Con "+euros+" tienes "+dolares+" $");
        
        
    }
}

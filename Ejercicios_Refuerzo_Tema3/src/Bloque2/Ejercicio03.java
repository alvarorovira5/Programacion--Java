/*
 * Hacer un programa que lea un numero por teclado y nos diga si menor que 100.
Llamar a la clase "menor.java"
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        if(numero<100){
            System.out.println("El "+numero+" es menor que 100.");
        }
        
    }
}

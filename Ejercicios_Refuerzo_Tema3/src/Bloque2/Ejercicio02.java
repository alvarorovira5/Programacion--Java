/*
 * Hacer un programa que lea un numero por teclado y nos diga si igual a -10.Llamar a
la clase "igual.java"
 */
package Bloque2;

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
        int numero;
        
        System.out.println("Dime un numero:");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        if(numero==-10){
            System.out.println("El numero "+numero+" es igual a -10.");
        }
    }
}

/*
 * Hacer un programa que lea un numero por teclado y nos diga si mayor que cero.
Llamar a la clase "mayor.java"
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        
        float numero;
        
        System.out.println("Dime un numero:");
        cad=teclado.nextLine();
        numero=Float.parseFloat(cad);
        
        if (numero>0){
            System.out.println("Si es mayor que cero.");
        }
        else{
            System.out.println("No es mayor que cero.");
        }
    }
}

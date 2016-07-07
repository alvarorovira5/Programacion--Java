/*
 * Realizar un programa que lea un caracter por teclado y nos muestre si es una
letra minúscula. Llamar a la clase "minuscula.java"
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        char letra;
        
        System.out.print("Dime un caracter ");
        cad=teclado.nextLine();
        letra=cad.charAt(0);
        
        if(letra>='a' && letra<='z'){
            System.out.println("La letra introducida es  minuscula. ");  
        }
        
    }
}

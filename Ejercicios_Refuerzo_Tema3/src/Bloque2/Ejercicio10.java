/*
 * Realizar un programa que lea un carácter por teclado y nos muestre si es una
letra mayúscula. Llamar a la clase "mayuscula.java"
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        char letra;
        
        System.out.print("Dime una letra: ");
        cad=teclado.nextLine();
        letra=cad.charAt(0);
        
        if((letra>='A') && (letra<='Z')){
            System.out.println("La letra introducida es MAYUSCULA.");
        }
        
        
    }
}

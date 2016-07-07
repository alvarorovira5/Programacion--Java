/*
 * Realizar un programa que lea un caracter por teclado y nos muestre si es una
letra mayúscula o minúscula o un dígito. Llamar a la clase
"mayus_minus_digito.java"
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio13 {

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
        
        if(letra>='A' && letra<='Z'){
            System.out.println("La letra introducida es  mayuscula. ");  
        }
        else{
            if(letra>='a' && letra<='z'){
                System.out.println("La letra es minuscula. ");
            }
            else{
                System.out.println("Es un numero");
            }
            
        }
        
    }
}

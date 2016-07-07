/*
 * Calcular el factorial de un número entero introducido por teclado.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero,factorial=1;
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        for(int i=1;i<=numero;i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+numero+ " es " +factorial);
    }
}

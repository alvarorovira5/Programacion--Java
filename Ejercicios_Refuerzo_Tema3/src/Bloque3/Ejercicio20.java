/*
 * Muestra por pantalla los divisores de un número entero introducido por teclado.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("Dime un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        System.out.print("Los divisores son ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(+i+" ");
            }
        }
        
    }
}

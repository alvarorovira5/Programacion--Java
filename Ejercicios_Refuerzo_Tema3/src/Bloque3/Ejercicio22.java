/*
 * Introducir un número por teclado e indica si es o no perfecto. Un número es
perfecto si la suma de los divisores, excepto el propio número, coincide con el
número.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n,sumaDivisor=0;
        
        System.out.print("Introduce un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sumaDivisor=sumaDivisor+i;
            }
        }
        if(sumaDivisor-n==n){
            System.out.println("El numero "+n+" es perfecto");
        }
        else{
            System.out.println("El numero no "+n+" es perfecto");
        }
    }
}

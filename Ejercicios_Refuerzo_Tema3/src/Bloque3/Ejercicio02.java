/*
 * Diseña una clase que consista en introducir 10 números enteros por teclado.
Contar cuántos se han introducido iguales a 0.
 */
package Bloque3;
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
        int n,contador_ceros=0;
        
        System.out.println("Dime un numero: ");
        for(int i=1;i<11;i++){
            cad=teclado.nextLine();
            n=Integer.parseInt(cad);
            
            if(n==0){
                contador_ceros=contador_ceros+1;
            }
        }
        System.out.println("Hay "+contador_ceros+" ceros");
    }
}

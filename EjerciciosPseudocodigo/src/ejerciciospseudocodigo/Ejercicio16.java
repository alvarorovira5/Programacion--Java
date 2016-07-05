/*
 * Contar cuántos múltiplos de 3 hay comprendidos entre 45 y 59.
 */
package ejerciciospseudocodigo;

/**
 *
 * @author Alvaro
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=45,contador=0;
        
        System.out.println("Los multiplos son:");
        while(n<60){
            if(n%3==0){
                System.out.println(+n+" es multiplo de 3");
                contador=contador+1;
            }
            n=n+1;
        }
        System.out.println("Hay "+contador+" multiplos de 3.");
    }
}

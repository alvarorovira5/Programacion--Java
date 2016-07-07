/*
 * Halla la suma de los pares comprendidos entre 50 y 500, muestra los múltiplos de
3 y cuenta los múltiplos de 5. Hacedlo de 3 formas distintas de for.
 */
package Bloque3;

/**
 *
 * @author Alvaro
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0,contador_multiplo5=0;
        System.out.println("Numero comprendidos entre 50 y 500.");
        for(int i=50;i<501;i++){
            if(i%2==0){
                suma=suma+1;
            }
            if(i%3==0){
                System.out.println("Los multiplos de 3 son "+i);
            }
            if(i%5==0){
                contador_multiplo5=contador_multiplo5+1;
            }
        }
        System.out.println("La suma de los numero pares es "+suma);
        System.out.println("Hay "+contador_multiplo5+" multiplos de 5.");
    }
}

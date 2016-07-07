/*
 * De todos los nº comprendidos entre 100 y 150, mostrar todos los múltiplos de 3.
Indicar cúantos múltiplos hay de 5. Calcula la suma de todos los pares.
 */
package Bloque3;

/**
 *
 * @author Alvaro
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador_multiplo5=0,sumapar=0;
        System.out.println("Entre 100 y 150 hay los siguientes multiplos de 3 y el numero de multiplos de 5.");
        for(int i=100;i<151;i++){
            if(i%3==0){
                System.out.println("El numero "+i+ " es multiplo de 3");
            }
            if(i%5==0){
                contador_multiplo5=contador_multiplo5+1;
            }
            if(i%2==0){
                sumapar=sumapar+i;
            }
        }
        System.out.println("Hay "+contador_multiplo5+" multiplos de 5.");
        System.out.println("La suma de los pares es "+sumapar);
    }
}

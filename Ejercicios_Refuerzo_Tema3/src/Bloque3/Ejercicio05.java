/*
 * Mostrar los múltiplos de 5 y 3 comprendidos entre 20 y 200.
 */
package Bloque3;

/**
 *
 * @author Alvaro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Los multiplos de 3 y 5 comprendidos entre 20 y 200 son");
        for(int i=20;i<201;i++){
            if((i%3==0)&& (i%5==0)){
                System.out.println(i);
            }
            
        }
    }
}

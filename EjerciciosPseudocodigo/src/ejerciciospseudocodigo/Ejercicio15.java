/*
 * Escribir los múltiplos de 3 comprendidos entre 24 y 45.
 */
package ejerciciospseudocodigo;

/**
 *
 * @author Alvaro
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=24;
        System.out.println("Los multiplos de 3 comprendido entre 24 y 45 son:");
        while(n<46){
            if(n%3==0){
                System.out.println(+n+" es multiplo de 3");
            }
            n=n+1;
        }
    }
}

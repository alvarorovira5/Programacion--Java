/*
 * Escribir los 5 primeros números pares.
 */
package ejerciciospseudocodigo;

/**
 *
 * @author Alvaro
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador=0;
        System.out.println("Los cinco primeros numeros pares son: ");
        for(int i=1;contador<5;i++){
            if(i%2==0){
                System.out.println("El numero "+i+".");
                contador=contador+1;
            }
            
        }
    }
}

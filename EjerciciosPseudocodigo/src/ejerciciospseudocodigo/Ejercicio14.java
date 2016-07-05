/*
 * Escribir los números comprendidos desde el 100 hasta el 90.
 */
package ejerciciospseudocodigo;

/**
 *
 * @author Alvaro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int contador=100;
        
        do{            
            System.out.println("Mostrar contador "+contador);
            contador=contador-1;
           } while(contador>89); 
        }
}

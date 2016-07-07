/*
 * Calcula la suma de las potencias de 2 desde el 0 al 10. Potencia: Math.pow. Llama
a la clase 'potencias2.java'.
 */
package Bloque3;

/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,suma=0;
        
        System.out.println("Calcula la suma de las potencias de 2 desde el 0 hasta el 10.");
        for(int i=0;i<11;i++){
            
            n=(int) Math.pow(2,i);
            System.out.println(n);
            suma=suma+n;
        }
        System.out.println("La suma de las potencias de dos es "+suma);
    }
}

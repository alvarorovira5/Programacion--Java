/*
 * Muestra los N primeros múltiplos de 4, donde N es un valor introducido por
teclado.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int contador=0,i=4,N;
        
        System.out.println("Dime el rango: ");
        cad=teclado.nextLine();
        N=Integer.parseInt(cad);
        
        while(contador<N){
        if(i%4==0){
            contador=contador+1;
            System.out.println("El "+i+ " es multiplo de 4");
        }
        i++;
        }  
    }
}

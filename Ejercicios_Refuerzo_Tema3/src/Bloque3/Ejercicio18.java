/*
 * 18)Introduce por teclado 10 números enteros, calcula cuál es el mayor.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        
        System.out.println("Dime los 10 numeros enteros y di cual es el mayor: ");
        int mayor=0;
        
        for(int contador=1;contador<11;contador++){
            System.out.println("Dime un numero: ");
            cad=teclado.nextLine();
            int n;
            n=Integer.parseInt(cad);
            mayor=(mayor<n)?n:mayor;
        }
        System.out.println("El mayor es "+mayor);
    }
}

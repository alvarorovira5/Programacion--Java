/*
 * Diseña una clase donde se realice una validación de entrada de datos, como por
ejemplo, introduce un número que ha de estar comprendido entre 1 y 12,
rechazando los restantes, e indicar su correspondiente en nombre de mes.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        
        
        do{
            System.out.println("Introduce un numero");
            cad=teclado.nextLine();
            n=Integer.parseInt(cad);
        }
        while(n<1 || n>12);//condición de salida, se ejecuta al menos 1 vez.
        System.out.println("El numero comprendido entre 1 y 12 es "+n);
    
    }
}
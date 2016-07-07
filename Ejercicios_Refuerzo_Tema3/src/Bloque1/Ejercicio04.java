/*
 * Diseña una clase que realice la conversión siguiente: una temperatura dada en
grados Celsius en Fahrenheit.Llama a la clase 'celsius.java'
Fº = 9/5 Cº +32.
 */
package Bloque1;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        double grados,Fahrenheit;
        
        System.out.print("Dime los grados que hay ");
        cad=teclado.nextLine();
        grados=Float.parseFloat(cad);
        
        Fahrenheit=(1.8)*grados+32;
        
        System.out.println("En grados Fahrenheit "+Fahrenheit+" .");
        
    }
}

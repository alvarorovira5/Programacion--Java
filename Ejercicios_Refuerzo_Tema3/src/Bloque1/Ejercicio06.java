/*
 * Diseña una clase donde se introduzcan dos variables de tipo int, y se
intercambien sus valores. Llama a la clase 'intercambio.java'.
 */
package Bloque1;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int a,b,aux;
        
        System.out.print("Introduce un valor para a: ");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        System.out.print("Introduce un valor para b: ");
        cad=teclado.nextLine();
        b=Integer.parseInt(cad);
        
        aux=a;
        a=b;
        b=aux;
        
        System.out.println("Se intercambian los valores.");
        System.out.println("Ahora el valor de a es "+a);
        System.out.println("Ahora el valor de b es "+b);
        
    }
}

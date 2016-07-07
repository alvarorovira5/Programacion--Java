/*
 * Calcula el área de un triángulo en función de las longitudes de sus lados.
area=Math.sqrt(p*(p-A)*(p-B)*(p-C)) donde A,B,C son los lados y p es
semiperímetro, donde p=(A+B+C)/2. Llama a la clase triangulo.java.
 */
package Bloque1;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        double A,B,C,p,area;
        
        System.out.print("Dime la longitud del lado A: ");
        cad=teclado.nextLine();
        A=Double.parseDouble(cad);
        
        System.out.print("Dime la longitud del lado B: ");
        cad=teclado.nextLine();
        B=Double.parseDouble(cad);
        
        System.out.print("Dime la longitud del lado B: ");
        cad=teclado.nextLine();
        C=Double.parseDouble(cad);
        
        p=(A+B+C)/2;
        area=Math.sqrt(p*(p-A)*(p-B)*(p-C));
        System.out.println("El area del triangulo es "+area+ " .");
        
    }
}

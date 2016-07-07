/*
 * Calcula el perímetro de un rectángulo, introduciendo previamente la base y la
altura por teclado. Llama a la clase 'perimetro_rectangulo.java'
 */
package Bloque1;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        float base,altura,perimetro;
        
        System.out.print("Dime la base: ");
        cad=teclado.nextLine();
        base=Float.parseFloat(cad);
        
        System.out.print("Dime la altura: ");
        cad=teclado.nextLine();
        altura=Float.parseFloat(cad);
        
        perimetro=2*base+2*altura;
        
        System.out.println("El perimetro es "+perimetro+ " .");
    }
}

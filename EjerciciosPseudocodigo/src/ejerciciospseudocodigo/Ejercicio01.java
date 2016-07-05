
/*Programa que calcula la longitud de la circunferencia L=2*PI*r
 * y el área del círculo A=PI*r*r de radio introducido por
 * teclado.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        final float PI=(float) 3.1416; //Declaración de la constante PI
        
        float r,longitud,area;
        
        System.out.println("Dime el radio ");
        //Lo que hacemos en los pasos siguientes es cambiar el tipo string de cad a entero de r.
        cad=teclado.nextLine(); 
        r=Float.parseFloat(cad);
        
        longitud=2*PI*r;
        
        System.out.println("La longitud es "+longitud);
        
        area=PI*r*r;
        
        System.out.println("El area es "+area);     
    }
}

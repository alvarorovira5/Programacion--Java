/*
 * Resuelve una ecuación de primer grado, del tipo ax + b =0. Para ello se debe 
introducir 2 valores para a y b, y obtener el valor de x.
Ahora bien, si a =0 , b=0 entonces “la solución es indeterminada”, si a=0 y b!=0 
entonces “la solución es imposible”, si a !=0, entonces x=-b/a.
 */
package Bloque2;

import java.util.Scanner;


/**
 *
 * @author Alumno_3
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
       
        double x,a,b;
        
        System.out.println("Dime un valor entero para a:");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        System.out.println("Dime un valor entero para b:");
        cad=teclado.nextLine();
        b=Integer.parseInt(cad);
        
        if ((a==0) && (b==0)){
            System.out.println("La solucion es indeterminada.");
        }
        else{
            if((a==0)&& (b!=0)){
                System.out.println("La solución es imposible");
            }
            else{
                x=-b/a;
                System.out.println("La solucion es "+x+ ".");
            }
        }
    }
}

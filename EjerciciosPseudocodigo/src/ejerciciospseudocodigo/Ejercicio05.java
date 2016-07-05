/*
 * Programa que lee tres números y comprueba si alguno de ellos es suma de los otros dos. Si se cumple esta condición
 * escribir 'Iguales' y en caso contrario 'Distintos'.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        String cad;
        int a,b,c;
        
        System.out.println("Dime el primer digíto ");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        System.out.println("Dime el segundo digíto ");
        cad=teclado.nextLine();
        b=Integer.parseInt(cad);
        
        System.out.println("Dime el tercer digíto ");
        cad=teclado.nextLine();
        c=Integer.parseInt(cad);
        
        if ((a==b+c)|| (b==a+c)|| (c==a+b)){
            System.out.println("Son iguales ");
    }
        else System.out.println("Son distintos ");
                      
    }
}

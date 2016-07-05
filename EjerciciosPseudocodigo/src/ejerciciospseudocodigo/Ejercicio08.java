/*
 * Programa que lee un año e indica si es bisiesto.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int fecha;
        
        System.out.println("Dime el año");
        cad=teclado.nextLine();
        fecha=Integer.parseInt(cad);
        
        if((fecha%4==0)&&(fecha%100!=0)||((fecha%100==0)&&(fecha%400==0))){
            System.out.println("El año "+fecha+" es bisiesto");
        }
        else{
            System.out.println("El año "+fecha+" no es bisiesto");
        }
    }
}

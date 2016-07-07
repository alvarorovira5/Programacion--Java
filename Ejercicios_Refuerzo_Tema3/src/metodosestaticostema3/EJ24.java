/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

import java.util.Scanner;

/**
 *
 * @author Alumno_3
 */
public class EJ24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n,sumaDivisores=0,A = 0;
        
        System.out.print("Dime un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        boolean esprimo=Calculo.comprobarPrimo(n);
    }
}

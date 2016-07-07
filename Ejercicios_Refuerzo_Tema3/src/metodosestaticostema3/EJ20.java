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
public class EJ20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n;
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        Calculo.contarDivisores(n);
    }
}

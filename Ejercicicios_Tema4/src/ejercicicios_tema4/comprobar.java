/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class comprobar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("Introduce el tamaño del array ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        int z[];
        z=MetodosEstáticos.leerVector(n);
        MetodosEstáticos.mostraVector(z);
    }
}

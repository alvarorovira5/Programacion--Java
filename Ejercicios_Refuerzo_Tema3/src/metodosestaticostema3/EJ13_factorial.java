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
public class EJ13_factorial {

    /**
     * @param args the command line arguments
     */
    //Método MAIN
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("Dime un numero ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        long factorial;
        factorial=EJ13_factorial.calcularFactorial(n);
        System.out.println("El factorial de "+n+" es "+factorial);
    }
    //Método que calcula factorial.
    // tipo de dato de salida "long"   entre parentesis va la entrada del metodo.
    public static long calcularFactorial(int n){
        long fact=1;
        for(int cont=1;cont<=n;cont++){
            fact=fact*cont;
        }
        return fact;
    }
}

/*
 * Método estático: betweenNandM al que se le pasan dos enteros y muestra todos los números comprendidos entre ellos, inclusive.
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int N,M;
        System.out.print("Leer N: ");
        cad=teclado.nextLine();
        N=Integer.parseInt(cad);
        
        System.out.print("Leer M: ");
        cad=teclado.nextLine();
        M=Integer.parseInt(cad);
        
        betweenNandM(N,M);
      
    }
    public static void betweenNandM(int N,int M){
        for (int i=N; i <=M; i++) {
            System.out.print(i+", ");
        }
    }
}

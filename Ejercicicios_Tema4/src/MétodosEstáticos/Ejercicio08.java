/*
 * Método estático: doble que devuelva el doble del valor entero que se le pasa como parámetro.
 */
package MétodosEstáticos;
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
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
       
        System.out.println("El doble de "+numero+" es "+doble(numero));
    }
    public static int doble(int numero){
        int doble;
        doble=numero*2;
        return doble;
    }
}

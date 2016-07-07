/*
 * Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre 0 y 9). 
 * Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int array[]=new int[10];
        int posicion;
        System.out.println("Leer array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            array[i]=Integer.parseInt(cad);
        }
        System.out.println("Leer posicion: ");
        cad=teclado.nextLine();
        posicion=Integer.parseInt(cad);
        
        for (int i =posicion; i <9; i++) {
            array[i]=array[i+1];
        }
        System.out.println("Mostramos la tabla resultante: ");
        for (int i = 0; i <9; i++) {
            System.out.print(array[i]+", ");
        }
    }
}

/*
 * Leer 5 números y mostrarlos en orden inverso al introducido
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int lista[];
        lista=new int[5];
        //Leer vector
        for (int i = 0; i < lista.length; i++) {
            System.out.print("En v["+i+"] = ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        //Mostrar el vector en el orden inverso.
        System.out.print("La lista en orden inverso es: ");
        for (int i = lista.length-1; i>=0; i--) {
            System.out.print(lista[i]+", ");
        }
    }
}

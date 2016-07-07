/*
 * Leer 5 números y mostrarlos en el mismo orden introducido
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int lista[];
        lista=new int[5];
        
        //Leer vector
        System.out.println("Leer vector: ");
        for (int i = 0; i <lista.length; i++) {
            System.out.print("Para la posicion v["+i+"] = ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
            
        }
        //mostrar vector
        System.out.print("El vector es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+", ");
        }
    }
}

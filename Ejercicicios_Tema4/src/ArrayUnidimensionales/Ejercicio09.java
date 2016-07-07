/*
 * Crear un programa que lea por teclado un array de 10 números enteros y desplace 
 * una posición hacia la derecha sus elementos: el primero pasa a ser el segundo, 
 * el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
 * //REALIZADO YA
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int array[]=new int[10];
        
        System.out.println("Leer valores para el array: ");
        for (int i = 0; i <array.length; i++) {
            System.out.print("v["+i+"]= ");
            cad=teclado.nextLine();
            array[i]=Integer.parseInt(cad);
        }
        int ultimo=array[9];
        System.out.println("Deplazar todos los elementos una posicion hacia la derecha.");
        for (int i = 8; i>=0; i--) {
            array[i+1]=array[i];
        }
        array[0]=ultimo;
        
        System.out.print("Mostra el vector desplazado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}

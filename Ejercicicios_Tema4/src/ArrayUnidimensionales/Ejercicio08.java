/*
 * Diseñar una aplicación que declare un array de 10 elementos enteros. 
 * Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, 
 * insertarlo en la posición indicada, desplazando los que estén detrás
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        
        int array[]=new int[10];
        int numero, posicion;
        
        System.out.println("Leer 8 valores del array: ");
        for (int i = 0; i <8; i++) {
            System.out.print("Para v["+i+"] = ");
            cad=teclado.nextLine();
            array[i]=Integer.parseInt(cad);
        }
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        System.out.println("Dime la posicion: ");
        cad=teclado.nextLine();
        posicion=Integer.parseInt(cad);
        
        //Introducir el valor en la posicion indicada.
        for (int i = 7; i>=posicion; i--) {
            array[i+1]=array[i];
        }
        array[posicion]=numero;
        System.out.println("Mostrar la tabla resultante: ");
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}

/*
 * Crear un array bidimensional de tamaño 7x7 y rellenarlo de forma que los elementos de la diagonal principal sean 1 y el resto 0.
 */
package ArrayN.Dimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int matriz[][]=new int[7][7];
        
        System.out.println("Leer matriz: ");
        for (int fila = 0; fila < 7; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                if(fila==columna){
                    matriz[fila][columna]=1;
                }
                else{
                    matriz[fila][columna]=0;
                }
            }
        }
        System.out.println("La matriz resultante es: ");
        for (int fila = 0; fila < 7; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                System.out.println(matriz[fila][columna]+", ");
            }
        }
    }
}

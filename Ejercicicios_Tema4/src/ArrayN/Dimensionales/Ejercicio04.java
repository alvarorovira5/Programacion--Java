/*
 * Crear y cargar un array bidimensional de tamaño 3x3, trasponerlo y mostrarlo.
 */
package ArrayN.Dimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int matriz[][]=new int[3][3];
        int aux;
        
        System.out.println("Introducir la matriz: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("matriz["+fila+"]["+columna+"]=");
                cad=teclado.nextLine();
                matriz[fila][columna]=Integer.parseInt(cad);
            }
        }
        System.out.println("Mostramos la matriz introduzida: ");
        for (int fila = 0; fila <3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println(matriz[fila][columna]);
            }
        }
        System.out.println("Trasponemos la matriz");
        //trasponemos los elementos por debajo de la diagonal principal.
        for (int fila = 1; fila <3; fila++) {
            for (int columna = 0; columna <fila; columna++) {
                aux=matriz[fila][columna];
                matriz[fila][columna]=matriz[columna][fila];
                matriz[columna][fila]=aux;
            }
        }
        
    }
}

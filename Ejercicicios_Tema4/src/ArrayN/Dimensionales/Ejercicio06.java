/*
 * Crear y cargar un array bidimensional de tamaño 10x10, 
 * mostrar la suma de cada fila y de cada columna.
 */
package ArrayN.Dimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int matriz[][] =new int[10][10];
        
        System.out.println("Introducir matriz: ");
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.println("matriz ["+fila+"]["+columna+"]= ");
                cad=teclado.nextLine();
                matriz[fila][columna]=Integer.parseInt(cad);
            }
        }
        System.out.println("Suma de fila a fila.");
        for (int columna = 0; columna < 10; columna++) {
            int sumaFila=0;
            for (int fila = 0; fila < 10; fila++) {
                sumaFila=sumaFila+matriz[fila][columna];
            }
            System.out.println("Suma Fila = "+sumaFila);
        }
        System.out.println("Suma de columna a columna.");
        for (int fila = 0; fila < 10; fila++) {
            int sumaColumna=0;
            for (int columna = 0; columna < 10; columna++) {
                sumaColumna=sumaColumna+matriz[fila][columna];
            }
            System.out.println("Suma Columa = "+sumaColumna);
        }
    }
}

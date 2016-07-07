/*
 * Utilizando dos arrays bidimensionales de tamaño 5x9 y 9x5, cargar el primero y trasponerlo en el segundo.
 */
package ArrayN.Dimensionales;
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
        
        int matriz[][]=new int[5][9];
        int traspuesta[][]=new int[9][5];
        
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                System.out.println("Matriz ["+fila+"]["+columna+"]= ");
                cad=teclado.nextLine();
                matriz[fila][columna]=Integer.parseInt(cad);
            }
        }
        
        //Hacer el cambio.
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                traspuesta[columna][fila]=matriz[fila][columna];
            }
        }
        
        System.out.println("Mostra la matriz traspuesta: ");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                System.out.println(traspuesta[fila][columna]+", ");
            }
        }
    }
}

/*
 * Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma (guardada en otra matriz).
 */
package ArrayN.Dimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int suma[][]=new int[3][3];
        
        System.out.println("Mostrar la matriz de A ");
        for (int fila = 0; fila <A.length; fila++) {
            for (int columna = 0; columna <A.length; columna++) {
                System.out.println("A["+fila+"]["+columna+"]= ");
                cad=teclado.nextLine();
                A[fila][columna]=Integer.parseInt(cad);
            }
        }
        System.out.println("Mostrar la matriz de B ");
        for (int fila = 0; fila <B.length; fila++) {
            for (int columna = 0; columna < B.length; columna++) {
                System.out.println("B["+fila+"]["+columna+"]= ");
                cad=teclado.nextLine();
                B[fila][columna]=Integer.parseInt(cad);
            }
        }
            //Calculamos la suma.
        for (int fila = 0; fila < suma.length; fila++) {
            for (int columna = 0; columna < suma.length; columna++) {
                suma[fila][columna]=A[fila][columna]+B[fila][columna];
            }
        }
        //Mostramos la suma.
        System.out.println("Mostramos la suma: ");
        for (int fila = 0; fila <3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println(suma[fila][columna]+" ");
            }
            
        }
    }
}

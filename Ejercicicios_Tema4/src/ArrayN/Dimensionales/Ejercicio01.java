/*
 * Crear un array bidimensional de tamaño 5x5 y 
 * rellenarla de la siguiente forma: la posición T[n,m] 
 * debe contener n+m. Después se debe mostrar su contenido.
 */
package ArrayN.Dimensionales;

/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int[5][5];
        
        for (int fila = 0; fila <5; fila++) {
            for (int columna = 0; columna <5; columna++) {
                matriz[fila][columna]=fila+columna;
            }
        }
        System.out.println("Mostrar la matriz: ");
        for (int fila =0; fila<5; fila++) {
            System.out.println();
            for (int columna = 0; columna <5; columna++) {
                System.out.print(matriz[fila][columna]+" ");
            }
        }
    }
}

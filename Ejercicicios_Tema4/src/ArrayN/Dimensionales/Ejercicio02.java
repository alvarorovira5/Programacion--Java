/*
 *Crear y cargar un array bidimensional de tamaño 4x4 y decir si es simétrico o no,
 * es decir si se obtiene el mismo array al cambiar las filas por columnas.
 */
package ArrayN.Dimensionales;
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
        
        int matriz[][]=new int[4][4];
        boolean simetrica=true;
        
        System.out.println("Leer los datos de la matriz: ");
        for (int fila = 0; fila <4; fila++) {
            for (int columna = 0; columna <4; columna++) {
                System.out.println("matriz["+fila+"]["+columna+"]");
                cad=teclado.nextLine();
                matriz[fila][columna]=Integer.parseInt(cad);
            }
        }
        
        int fila=0;
        while(fila<4 && simetrica==true){
            int columna=0;
            while(columna<fila && simetrica==true){
                if(matriz[fila][columna]!=matriz[columna][fila]){
                    simetrica=false;
                }
                columna=columna+1;
            }
            fila=fila+1;
        }
        
        if(simetrica){
            System.out.println("Es simetrica.");
        }
        else{
            System.out.println("No es simetrica.");
        }
        
    }
}

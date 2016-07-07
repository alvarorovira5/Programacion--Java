/*
 * Utilizando el vector anterior, calcular cuál es el mayor de los x elementos del vector (x
es un número entero introducido por teclado).
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("El tamaño del array es: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        //El array recibe el tamaño de n
        int lista[]=new int[n];
        //Damos valores al array
        for (int i = 0; i < n; i++) {
            System.out.println("Para la posicion "+i);
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        //Recorremos el array para buscar el mayor elemento.
        int mayor=lista[0];
        for (int i = 1; i <lista.length; i++) {
            if(mayor<lista[i]){
                mayor=lista[i];
            }
        }
        System.out.println("El mayor es "+mayor);
    }
}

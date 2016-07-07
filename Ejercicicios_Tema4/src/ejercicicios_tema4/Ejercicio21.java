/*
 * Indicar cuál es el elemento menor y la posición que ocupa de los x elementos del
vector (x es un número entero introducido por teclado).
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        System.out.print("Introduce el rango del array: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        int lista[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("En la posicion "+i+" valor de ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        int posicion=0;
        int menor=lista[0];
        for (int i = 1; i < lista.length; i++) {
            if(menor>lista[i]){
                menor=lista[i];
                posicion=i;
            }
        }
        System.out.println("El menor es "+menor+" en la posición "+posicion);
    }
}

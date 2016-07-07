/*
 * Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
 */
package ArrayUnidimensionales;
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
        Scanner teclado= new Scanner(System.in);
        String cad;
        int lista[];
        lista=new int[10];
        //Leer
        for(int i=0;i<lista.length;i++){
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        //Mostrar
        System.out.println("Mostrar los valores como se pide");
        for (int i = 0; i < lista.length/2; i++) {
            System.out.println(lista[i]);
            System.out.println(lista.length-i);
        }
    }
}

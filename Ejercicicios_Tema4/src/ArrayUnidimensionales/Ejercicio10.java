/*
 * Ídem, desplazar N posiciones (N es introducido por el usuario).
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int array[]=new int[10];
        int numero;
        System.out.println("Leer array: ");
        for (int i = 0; i <array.length; i++) {
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            array[i]=Integer.parseInt(cad);
        }
        
        System.out.print("Leer cuantas posiciones quieres desplazar: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        for(int bucle=1;bucle<=numero;bucle++){
         
            int ultimo=array[9];
            
            for (int i = 8; i>=0; i--) {
                array[i+1]=array[i];
            }
            array[0]=ultimo;
        }
        System.out.print("Mostrar vector desplazado "+numero+" posiciones ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}

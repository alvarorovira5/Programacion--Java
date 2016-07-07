/*
 * Leer por teclado dos arrays de 10 números enteros y mezclarlos en una tercera de la forma:
 * el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int v[]=new int[10];
        int w[]=new int[10];
        int z[]=new int[20];
        
        //Leer Vector V
        System.out.println("Vector V");
        for (int i = 0; i <v.length; i++) {
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            v[i]=Integer.parseInt(cad);
        }
        //Leer Vector W
        System.out.println("Vector W");
        for (int i = 0; i <w.length; i++) {
            System.out.print("w["+i+"] = ");
            cad=teclado.nextLine();
            w[i]=Integer.parseInt(cad);
        }
        System.out.println("Mezclados:");
        for (int i = 0; i <z.length; i++) {
            System.out.println(v[i]);
            System.out.println(w[i]);
        }
    }
}

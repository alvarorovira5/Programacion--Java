/*
 * Leer los datos correspondiente a dos arrays de 12 elementos numéricos, 
 * y mezclarlos en un tercero de la forma: 
 * 3 de la arrayA, 3 de la B, otros 3 de A, otros 3 de la B, etc
 */
package ArrayUnidimensionales;
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
        Scanner teclado= new Scanner(System.in);
        String cad;
        int v[]=new int[12];
        int w[]=new int[12];
        int z[]=new int[24];
        int contadorV=1,contadorW=1;
        System.out.println("Leer V:");
        for (int i = 0; i <v.length; i++) {
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            v[i]=Integer.parseInt(cad);
        }
        System.out.println("Leer W:");
        for (int i = 0; i <w.length; i++) {
            System.out.print("w["+i+"] = ");
            cad=teclado.nextLine();
            w[i]=Integer.parseInt(cad);
        }
        for (int i = 0; i <z.length; i++) {
            if(contadorV<4){
                System.out.println(v[i]);
                contadorV=contadorV+1;
            }
            else{
                if(contadorW<4){
                System.out.println(w[i]);
                contadorW=contadorW+1;
                }
            }
            contadorV=1;
            contadorW=1;
        }
    }
}

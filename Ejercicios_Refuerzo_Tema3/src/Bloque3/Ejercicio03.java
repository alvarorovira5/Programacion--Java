/*
 * Calcula la media de 5 números introducidos por teclado.
 */
package Bloque3;
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
        float numero,media,suma=0;
        
        System.out.println("Introduce 5 numeros: ");
        for(int i=1;i<6;i++){
            cad=teclado.nextLine();
            numero=Float.parseFloat(cad);
            
            suma=suma+numero;
        }
        
        media=suma/5;
        System.out.println("La media es "+media);
    }
}

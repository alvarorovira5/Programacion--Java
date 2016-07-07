/*
 * Un banco paga un 2% de interés anual a un cliente que posee una cuenta, el
capital inicial es de 6.000€. Se desea determinar la cantidad de dinero en la que
se convertirá a los n años, donde n es introducido por teclado.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        double intereses;
        int n;
        final double interes=0.02;
        double capital=6000;
        
        System.out.println("Cuantos años quieres mantener el dinero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        int contador;
        for(contador=1;contador<=n;contador++){
            intereses=capital*interes;
            capital=capital+intereses;
        }
        System.out.println("El capital total es "+capital);
        
    }
}

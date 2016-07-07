/*
 * Un capital c se coloca a un interés anual r. ¿Al cabo de cuántos años se doblará?
El interés producido por un capital al cabo de un año es: i=(c*r)/100, el capital
acumulado en ese tiempo es ca=c*(1+r*(/100), para doblar el capital será preciso que ca
llegue a 2*c.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        float capital;
        System.out.println("Dime el capital que se va a introducir");
        cad=teclado.nextLine();
        capital=Float.parseFloat(cad);
        
        System.out.println("Que interes tiene el banco");
        cad=teclado.nextLine();
        float interes=Float.parseFloat(cad);
        
        int anyos=0;
        float capitalFinal=capital*2;
        
        while(capital<capitalFinal){
            float intereses=capital*interes/100;
            capital=capital+intereses;
            anyos=anyos+1;
        }
        System.out.println("Es necesario "+anyos);
    }
}

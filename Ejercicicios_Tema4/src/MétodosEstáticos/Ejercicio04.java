/*
 * Diseñar un método estático máximo, que tenga como parámetros dos números reales (float), 
 * y que devuelva el máximo de los dos. El método estará sobrecargado.
 */
package MétodosEstáticos;
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
        Scanner teclado=new Scanner(System.in);
        String cad;
        float num1,num2;
        
        System.out.print("Leer num1: ");
        cad=teclado.nextLine();
        num1=Float.parseFloat(cad);
        
        System.out.print("Leer num2: ");
        cad=teclado.nextLine();
        num2=Float.parseFloat(cad);
        
        
        System.out.println("El valor maximo de los dos numero introducidos es "+maximo(num1,num2));
    }
    public static float maximo(float num1,float num2){
        float max;
        if(num1>num2){
            max=num1;
        }
        else{
            max=num2;
        }
        return max;
    }
}

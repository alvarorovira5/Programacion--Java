/*
 * Diseñar un método estático maximo que tenga como parámetros dos números enteros, y que devuelva el máximo de los dos.
 */
package MétodosEstáticos;
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
        int num1,num2;
        
        System.out.println("Leer num1: ");
        cad=teclado.nextLine();
        num1=Integer.parseInt(cad);
        
        System.out.println("Leer num2: ");
        cad=teclado.nextLine();
        num2=Integer.parseInt(cad);
        
        
        System.out.println("El mayor de los dos numeros introducidos es: "+maximo(num1,num2));
    }
    public static int maximo(int num1,int num2){
        int max;
        if(num1>num2){
            max=num1;
        }
        else{
            max=num2;
        }
        return max;
    }
}

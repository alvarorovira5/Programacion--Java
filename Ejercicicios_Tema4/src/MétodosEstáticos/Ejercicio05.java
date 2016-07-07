/*
 * Ídem una versión que devuelva el máximo de 3 números enteros, cuyo nombre es maximo. El método estará sobrecargado.
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int num1,num2,num3;
        
        System.out.print("Leer num1: ");
        cad=teclado.nextLine();
        num1=Integer.parseInt(cad);
        
        System.out.print("Leer num2: ");
        cad=teclado.nextLine();
        num2=Integer.parseInt(cad);
        
        System.out.print("Leer num3: ");
        cad=teclado.nextLine();
        num3=Integer.parseInt(cad);
        
        System.out.print("El mayor de los tres es: "+maximo(num1,num2,num3));
    }
    public static int maximo(int num1,int num2,int num3){
        int maximo;
        if((num1>num2)&&(num1>num3)){
        maximo=num1;
        }
        else{
            if(num2>num3){
                maximo=num2;
            }
            else{
                   maximo=num3;
            }
        }
        return maximo;
    }
}

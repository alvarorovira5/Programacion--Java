/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.print("Leer un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        int resultado;
        resultado=sumaImparesN(numero);
        System.out.println("La suma de los "+numero+" primeros numeros impares es: "+resultado);
    }
    public static int sumaImparesN(int numero){
        int sumaImpar=0;
        for (int i = 1; i <= numero; i++) {
            if(i%2!=0){
                sumaImpar=sumaImpar+i;
            }
        }
        return sumaImpar;
    }
}

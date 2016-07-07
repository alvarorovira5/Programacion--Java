/*
 * Método estático: contDivisoresPrimos tal que se le pasa un número entero y devuelve el número de divisores primos que tiene.
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero;
        System.out.print("Leer numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        System.out.println("Tiene "+contDivisoresPrimos(numero));
    }
    public static boolean primo(int numero){
        boolean primo=true;
        int i=2;
        
        while(i<numero && primo==true){
            if(numero%i==0){
                primo=false;
            }
            i=i+1;
        }
        return primo;
        }
        public static int contDivisoresPrimos(int numero){
        int contador=1;
        for (int i = 2; i <numero; i++) {
            if(numero%i==0 && primo(i)){
                contador=contador+1;
            }
        }
        return contador;
    }
    
}

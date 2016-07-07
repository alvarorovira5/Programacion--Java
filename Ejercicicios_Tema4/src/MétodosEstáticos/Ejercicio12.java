/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MétodosEstáticos;
import static MétodosEstáticos.Ejercicio11.contDivisoresPrimos;
import static MétodosEstáticos.Ejercicio11.primo;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio12 {

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
        public static int[]divisor(int numero){
            int div[]=new int[contDivisoresPrimos];
            int numeroDivisores;
            contDivisoresPrimos=contDivisoresPrimos(numero);
        }
    
}
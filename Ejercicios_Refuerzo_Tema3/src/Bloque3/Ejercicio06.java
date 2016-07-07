/*
 * Dados 10 números enteros, visualizar la suma de los números pares de la lista.
¿Cúantos son números pares y cuál es la media aritmética de los números
impares?
 */
package Bloque3;
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
        int numero,suma_par=0,suma_impar=0,contador_pares=0,contador_impar=0,media_impar;
        
        System.out.println("Dame 10 numeros enteros: ");
        for(int i=1;i<11;i++){
            cad=teclado.nextLine();
            numero=Integer.parseInt(cad);
            if(numero%2==0){
                suma_par=suma_par+numero;
                contador_pares=contador_pares+1;
            }
            else{
                suma_impar=suma_impar+numero;
                contador_impar=contador_impar+1;
            }
        }
        media_impar=suma_impar/contador_impar;
        System.out.println("La suma de los numero pares es "+suma_par);
        System.out.println("Hay "+contador_pares+ " pares.");
        System.out.println("La media de numero impares es "+media_impar);
    }
}

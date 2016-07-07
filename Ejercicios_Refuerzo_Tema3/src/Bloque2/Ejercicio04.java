/*
 * Hacer un programa que lea dos numero por teclado y nos muestre si el primero es
"mayor o igual" que el segundo. Llamar a la clase "mayor_o_igual.java"
 */
package Bloque2;

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
        Scanner teclado= new Scanner(System.in);
        String cad;
        int numero1,numero2;
        
        System.out.println("Dime el primer numero ");
        cad=teclado.nextLine();
        numero1=Integer.parseInt(cad);
        
        System.out.println("Dime el segundo numero ");
        cad=teclado.nextLine();
        numero2=Integer.parseInt(cad);
        
        if(numero1>numero2){
            System.out.println("El primer numero es mayor que el segundo.");
        }
        else{
            if(numero1==numero2){
                System.out.println("Los dos numeros son iguales.");
            }
        }
        
    }
}

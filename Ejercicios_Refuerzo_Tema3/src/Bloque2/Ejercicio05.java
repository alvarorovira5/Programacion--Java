/*
 * Hacer un programa que lea dos numero por teclado y nos muestre el mayor, el menor
o si son iguales. Llamar a la clase "mayor_menor.java"
 */
package Bloque2;

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
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n1,n2;
        
        System.out.println("Dime el primer numero: ");
        cad=teclado.nextLine();
        n1=Integer.parseInt(cad);
        
        System.out.println("Dime el segundo numero: ");
        cad=teclado.nextLine();
        n2=Integer.parseInt(cad);
        
        if (n1>n2){
            System.out.println("El mayor es "+n1);
            System.out.println("El menor es "+n2);
            System.out.println("No son iguales.");
        }
        else{
            if(n1<n2){
                System.out.println("El mayor es "+n2);
                System.out.println("El menor es "+n1);
                System.out.println("No son iguales.");
            }
            else{
                System.out.println("Son iguales.");
            }
        }
             
    }
}

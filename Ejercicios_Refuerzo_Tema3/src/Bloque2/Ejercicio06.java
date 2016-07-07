/*
 * Hacer un programa que lea un numero por teclado y nos diga si es PAR o IMPAR. 
Llamar a la clase "paridad.java"
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        if(numero%2==0){
            System.out.println("El numero "+numero+" es par.");
        }
        else{
            System.out.println("El numero "+numero+" es impar.");
        }
          

    }
}

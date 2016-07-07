/*
 * Realizar un programa que lea un numero entero por teclado y nos muestre si es
"mayor de 10 y menor de 20" o "mayor de 15 y menor de 25". Llamar a la clase
"rango.java"
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.print("Introduce un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        if(numero>10 && numero <20){
                
            System.out.println("El numero "+numero+ " es mayor que 10 pero menor que 20");
        }
        
        if(numero>15 && numero<25){
            System.out.println("El numero "+numero+ "es mayor que 15 pero menor que 25");
       
        }
           
    }
}

/*
 * Encontrar el entero positivo más pequeño (num) para el cual la suma
1+2+3+4+5+....+num sea menor que límite (número entero introducido por
teclado)
 */
package Bloque3;

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
        Scanner teclado=new Scanner(System.in);
        String cad;
        int limite;
        
        System.out.println("Dime el valor del limite ");
        cad=teclado.nextLine();
        limite=Integer.parseInt(cad);
        
        int suma=0;
        int n;
        
        n=1;
        while(suma<limite){
            suma=suma+n;
            n=n+1;
        }
        System.out.println("El ultimo n entero positivo "+(n-2));
    }
    
}

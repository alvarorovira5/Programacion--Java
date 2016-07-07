/*
 * Utilizando el vector anterior (ejercicio 10). 
 * Comprueba si un número entero introducido por teclado se encuentra en el vector, 
 * utilizando el método de la búsqueda lineal.
 */
package ejercicicios_tema4;

import java.util.Scanner;
public class Ejercicio14 {

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n;
        int lista[]={12,4,5,78,45,67,45,66,77,44};
        boolean encontrado=false;
        //Nota los arrays comienza en la posicion 0.
        
        //Escribir el array
        System.out.print("El arrays es ");
        for (int i = 0; i <lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
        System.out.print("Introduce un valor: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);     
       
        //Busqueda lineal
        for (int i = 0; i <lista.length; i++) {
            if(n==lista[i]){
               
                encontrado=true;
                break;
            }
            
        }
        if(encontrado==true){
            System.out.println("El elemento "+n+" esta en el vector ");
        }
        else{
            System.out.println("El elemento "+n+"  no esta en el vector ");
        }
                
    }
}

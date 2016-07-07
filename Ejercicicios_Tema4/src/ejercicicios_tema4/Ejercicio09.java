/*
 * Introducir un vector de 10 elementos enteros por teclado.
a. Mostrar cual es el menor de todos y la posición que ocupa.
b. Mostrar cual es el mayor de todos y las veces que se repite.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int lista[]=new int[10];
        int repiteMayor=0;
        
        System.out.println("Introduce los elementos: ");
        //Introducir valores.
        for(int i=0;i<lista.length;i++){
            System.out.print("En la posicion "+i+" del array tiene el valor ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        int menor=lista[0];
        int i,posicion = 0;
        //For para buscar el valor minimo y su posicion
        for(i=1;i<lista.length;i++){
            if(menor>lista[i]){
               menor=lista[i];
               posicion=i;
            }
        }
       System.out.println("Elsss menor es "+menor+ " y ocupa la posicion "+posicion+1);
        
        //B
        //Busco el elemento mayor de la lista.
        int mayor=lista[0];
        for(int j=1;j<lista.length;j++){
            if(mayor<lista[j]){
                mayor=lista[j];
            }
        }
        System.out.print("El numero mayor es "+mayor);
        
        //Busco las veces que se repite el numero mayor en la lista.
        for(int j=1; j<lista.length;j++){
            if(lista[j]==mayor){
                repiteMayor=repiteMayor+1;
            }
        }
        System.out.println(" y se repite "+repiteMayor+" veces.");
    }
    
}

/*
 * Declarar un vector que posea 10 elementos de tipo entero. 
 * Los valores de éstos son 12,4,5,78,45,67,45,66,77,44 (del primer al último elemento).
 * Introducir un número entero por teclado (x). 
 * Indicar cuántos elementos del vector son mayores, menores o iguales a x.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int lista[]={12,4,5,78,45,67,45,66,77,44};
        int numero,iguales=0,mayores=0,menores=0;
        System.out.print("Introduce un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        for(int i=0;i<lista.length;i++){
            if(numero==lista[i]){
                iguales=iguales+1;
            }
            if(numero>lista[i]){
                mayores=mayores+1;
            }
            if(numero<lista[i]){
                menores=menores+1;
            }
        }
        System.out.println("Hay "+iguales+" numeros iguales al "+numero);
        System.out.println("Hay "+menores+" numeros mayores al "+numero);
        System.out.println("Hay "+mayores+" numeros menores al "+numero);
            
    }
}

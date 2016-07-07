/*
 * Calcular la media aritmética de una lista de x elementos del vector, donde x se introduce previamente por teclado.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        int suma=0,media;
        
        System.out.print("Introduce un valor: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
       
        int lista[]= new int [n];
        //Introduzco por teclado los valores que va a contener el array.
        
        for(int i=0;i<lista.length;i++){
            System.out.print("Introduce el valor para la posicion "+i+" el valor es ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
            
        }
       
        for(int i=0;i<lista.length;i++){
            suma=suma+lista[i];
        }
        System.out.println("La suma es "+suma);
        media=suma/lista.length;
        System.out.println("La media es "+media);
        
        
    }
}

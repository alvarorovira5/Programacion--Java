/*
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. 
 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int numero;
        int matriz[]=new int[10];
        
        System.out.println("Introducir los elementos del array, crecientes... :");
        for (int i = 0; i <matriz.length; i++) {
            System.out.println("v["+i+"] = ");
            //cad=teclado.nextLine();
            //matriz[i]=Integer.parseInt(cad);
            matriz[i]=teclado.nextInt();
        }
        
        System.out.println("Lee un numero: ");
        //cad=teclado.nextLine();
        //numero=Integer.parseInt(cad);
        numero=teclado.nextInt();
        int i=0;
        //Al estar ordenado crecientemente hacemos
        //este bucle while 
        while(i<10 && matriz[i]<numero){
            i++;
        }
        
        if(i==10){
            System.out.println("Elemento no encontrado.");
        }
        else{
            if(matriz[i]==numero){
                System.out.println("Valor encontrado en la posicion "+i);
            }
            else{
                System.out.println("Valor no encontrado.");
            }
        }
    }
}

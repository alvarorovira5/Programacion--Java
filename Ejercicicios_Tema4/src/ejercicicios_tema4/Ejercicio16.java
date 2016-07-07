/*
 * Introduce un número entero por teclado, 
 * muestra su correspondiente en binario (utiliza un vector inicial de un byte (8 elementos) y posteriormente de 4 bytes).
 */
package ejercicicios_tema4;
import java.util.Scanner;

public class Ejercicio16 {

    
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cad;
       
       int n,cociente,resto;
       int lista[];
       lista=new int[8];
       
        System.out.println("Introduce un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
       
        //Los valores que puede representar 2^8.
        if(n>=0 && n<=255){
            for(int i=0;i<lista.length;i++){
                cociente=n/2;
                resto=n%2;
                lista[lista.length-(i+1)]=resto; //porque lista.lenght es 8-0 es 8 y el vector va de 0 a 7 y le sumamos 1 a la i para que el vector sea 7.
                n=cociente;
            
        }
        }
        //Escribir el arrays
        System.out.print("El numero en binario de 8 bits es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            
        }
        System.out.println("");
    }
}

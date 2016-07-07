/*
 * Leer 10 enteros. Guardar en otro array los elementos pares del primero, y a continuación los elementos impares.
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int matriz[]= new int[10];
        
        //Leer valores del array
        for (int i = 0; i <matriz.length; i++) {
            System.out.print("v["+i+"] = ");
            cad=teclado.nextLine();
            matriz[i]=Integer.parseInt(cad);
        }
        
        int contadorPar=0;
        int contadorImpar=0;
        
        // Contamos los pares e impares que hay.
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i]%2==0){
                contadorPar=contadorPar+1;
            }
            else{
                contadorImpar=contadorImpar+1;
            }
        }
        //Creamos un array para pares e impares del tamaño dado.
        int par[]=new int[contadorPar];
        int impar[]=new int[contadorImpar];
        
        //Vuelvo a darle los valores de 0 para asignarselos a la posicion de cada array.
        contadorPar=0;
        contadorImpar=0;
        
        //En este paso asigno 
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i]%2==0){
                par[contadorPar]=matriz[i];
                contadorPar=contadorPar+1;
            }
            else{
                impar[contadorImpar]=matriz[i];
                contadorImpar=contadorImpar+1;
            }          
        }
        //Mostrar array par
        System.out.println("El array Par es: ");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i]+" ");
        }
        
        System.out.println("");
        
        //Mostrar array impar.
        System.out.println("El array Impar es: ");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i]+" ");
        }
    }
}

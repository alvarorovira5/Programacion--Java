/*
 * Utilizando el vector anterior (ejercicio 10, ordenado).
 * Comprueba si un número entero introducido por teclado se encuentra en el vector, 
 * utilizando el método de la búsqueda dicotómica(busqueda binaria)..
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
         int lista[]={12,4,5,78,45,67,45,66,77,44};
         int n;
        int aux;
        
        System.out.println("Introduce el numero a buscar");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        for (int i=0;i<lista.length;i++){
            for (int j = i; j<lista.length; j++) {
                if(lista[i]>lista[j]){//si invierto el sentido del menor al mayor me muestra el vector ordenador descendente
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        System.out.println("La vector ordenada es: ");
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        int izquierda=0,derecha=lista.length-1,centro;
        centro=(izquierda+derecha)/2;
        boolean encontrado=false;
        
        while(izquierda<=derecha){
            if(lista[centro]==n){
                encontrado=true;
                break;
            }
            else{
                if(lista[centro]>n){
                    derecha=centro-1;
                }
                else{
                    izquierda=centro+1;
                }
            }
            centro=(izquierda+derecha)/2;
        }
        if(encontrado){
            System.out.println(n+" Encontrado");
        }
        else{
            System.out.println(n+" No encontrado");
        }
    }
}

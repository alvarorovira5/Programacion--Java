/*
 * Diseñar una clase que pida por teclado 10 elementos de tipo real.
 * Calcular la media aritmética de todas las notas, y además 
 * indicar cuántas notas son superiores, inferiores o iguales a la media.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        float suma=0,media;
        int notasSuperiores=0,notasInferiores=0,IgualesMedia=0;
        
        float lista[];
        lista=new float[10];//Creo un array de 10 posiciones.
                            //Hay que utilizar new para crear el array, se utliza cuando hay que reñenarla.
        //Este for es para introducir los valores para cada asignación en memoria.
        for(int i=0;i<lista.length;i++){
            System.out.print("Dime un numero: ");
            cad=teclado.nextLine();
            lista[i]=Float.parseFloat(cad);
            suma=(suma+lista[i]);
        }
        System.out.println("La suma es "+suma);
        media=suma/lista.length;
        System.out.println("La media es "+media);
        
        for(int i=0;i<lista.length;i++){
            if(lista[i]>media){
                notasSuperiores=notasSuperiores+1;
            }
            else{
                if(lista[i]<media){
                    notasInferiores=notasInferiores+1;
                }
                else{
                    IgualesMedia=IgualesMedia+1;
                }
            }
        }
        System.out.println("Hay "+notasSuperiores+" superiores a la media.");
        System.out.println("Hay "+notasInferiores+" inferiores a la media.");
        System.out.println("Hay "+IgualesMedia+" iguales a la media.");
        
    }
}

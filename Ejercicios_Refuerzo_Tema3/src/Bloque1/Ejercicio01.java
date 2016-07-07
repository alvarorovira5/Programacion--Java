/*
 * Diseña una clase que calcule la desviación estándar de 6 números:
 */
package Bloque1;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int lista[]=new int[6];
        float n,suma=0;
        
        System.out.println("Mostrar los 6 numero:");
        for(int i=0;i<lista.length;i++){
            System.out.print("El valor en la posición "+i+" es ");
            cad=teclado.nextLine();
            lista[i]=(int) Float.parseFloat(cad);
            suma=suma+lista[i];
        }
        
        System.out.println("La suma es "+suma);
        
        float media;
        media=suma/6;
        System.out.println("La media es "+media);
        
        float desviacion,desviacion_estandar=0;
        
        for(int i=0;i<lista.length;i++){
           desviacion= (float)Math.pow(lista[i]-media,2);
           desviacion_estandar=desviacion_estandar+desviacion;
           
        }
        desviacion_estandar=desviacion_estandar/6;
        float d= (float) Math.sqrt(desviacion_estandar);
        System.out.println("La desviación estandar es "+d);
        
        
    }
}

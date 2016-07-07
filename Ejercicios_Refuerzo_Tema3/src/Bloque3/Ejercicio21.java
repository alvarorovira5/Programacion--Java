/*
 * Calcula el número de divisores que tiene un número entero introducido por
teclado y la suma de éstos.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("Dime un nº ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        int numero_de_divisores=0,suma_de_divisores=0;
        
        for(int cont=1;cont<=n;cont++){
            if(n%cont==0){
                numero_de_divisores=numero_de_divisores+1;
                suma_de_divisores=suma_de_divisores+cont;
            }
        }
        System.out.println("El numero "+n+" tiene "+numero_de_divisores+ " divisores y suma es "+suma_de_divisores);
    }
}

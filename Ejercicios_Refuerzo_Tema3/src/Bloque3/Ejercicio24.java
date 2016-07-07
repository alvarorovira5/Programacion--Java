/*
 * Introduce un número entero por teclado, e indica si es primo o no. Un número es
primo si solo posee dos divisores, el 1 y el propio número.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        System.out.println("Introduce un valor");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        if(n==1){
            System.out.println("1 No es primo");
        }
        
        int numDivisores=0;
        for(int cont=1;cont<=n;cont++){
            if(n%cont==0){
                numDivisores=numDivisores+1;
            }
        }
        if(numDivisores==2){
            System.out.println("El numero "+n+" primo");
        }
        else{
            System.out.println("El numero "+n+" no es primo.");
        }
    }
}

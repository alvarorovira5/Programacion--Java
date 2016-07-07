/*
 * Introduce 2 números enteros por teclado e indica si son amigos o no . Dos
números son amigos si, la suma de los divisores del primer número coincide con
el segundo, y viceversa, la suma de los divisores del segundo conicide con el
primero.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n,sumaDivisores=0,A = 0;
        
        System.out.print("Dime un numero: ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                sumaDivisores=sumaDivisores+i;
            }
        }
       sumaDivisores=sumaDivisores+n;
        
        int sumadivisoresA=sumaDivisores;
        int B = 0;
        n=B;
        sumaDivisores=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sumaDivisores=sumaDivisores+i;
            }
        }
        sumaDivisores=sumaDivisores+n;
        int sumaDivisoresB=sumaDivisores;
        
        if((sumadivisoresA==B)&&(sumaDivisoresB==A)){
            System.out.println(A+" y "+B+" son amigos.");
        }
        else{
            System.out.println(A+" y "+B+" no son amigos.");
        }
    }

}

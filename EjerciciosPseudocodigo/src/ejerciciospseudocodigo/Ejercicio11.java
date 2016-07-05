/*
 * Programa que lee y muestra el menor de tres enteros.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n1,n2,n3;
        
        System.out.println("Introduce el primer numero:");
        cad=teclado.nextLine();
        n1=Integer.parseInt(cad);
        
        System.out.println("Introduce el segundo numero:");
        cad=teclado.nextLine();
        n2=Integer.parseInt(cad);
        
        System.out.println("Introduce el tercer numero:");
        cad=teclado.nextLine();
        n3=Integer.parseInt(cad);
        
        if((n1>n2)&&(n2>n3)){
        System.out.println("El menor es "+n3);
        }
        else{
            if((n1>n2)&&(n2<n3)){
                System.out.println("El menor es "+n2);
            }
            else{
                if((n2>n1)&&(n1>n3)){
                    System.out.println("El menor es "+n3);
                }
                else{
                    if((n2>n1)&&(n1<n3)){
                        System.out.println("El menor es "+n1);
                    }
                    else{
                        if((n3>n1)&&(n1>n2)){
                            System.out.println("El menor es "+n2);
                        }
                        else{
                            if ((n3>n1)&&(n1<n2)){
                                System.out.println("El menor es "+n1);
                            }
                        }
                    }
                }
            }
        }
    }
}

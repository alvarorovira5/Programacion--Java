/*
 * Programa que lee una calificación según el sistema americano A, B, C, D, E,
 * F y muestra su equivalente LOE.
 * F: NP E:INSF D:SF C:B B:NOT A:SOB
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        char letra;
        System.out.println("Dime la calificación en el sistema americano:");
        cad=teclado.nextLine();
        letra=cad.charAt(0); // Se pone esto para coger el primer caracter de un string.
        
        if(letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F'){
            if(letra=='F'){
                System.out.println("La calificacion es No presentado");
            }
            else {
                if(letra=='E'){
                    System.out.println("La calificacion es Insuficiente");
                }
                else{
                    if(letra=='D'){
                        System.out.println("La calificacion es Suficiente");
                    }
                    else{
                        if(letra=='C'){
                            System.out.println("La calificacion es Bien");
                        }
                        else{
                            if(letra=='B'){
                                System.out.println("La calificacion es Notable");
                            }
                            else{
                                System.out.println("La calificacion es Sobresaliente");
                                }
                            }
                        }
                    }
                }
            }
        else{
            System.out.println("La letra "+letra+" no pertenece al Sistema Americano");
            }
        }
}

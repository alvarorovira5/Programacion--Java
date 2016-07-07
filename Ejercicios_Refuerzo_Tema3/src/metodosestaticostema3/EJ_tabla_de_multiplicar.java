/*
 * Mostrar la tabla de multiplicar de un numero introducico por teclado.
 */
package metodosestaticostema3;

import java.util.Scanner;

/**
 *
 * @author Alumno_3
 */
public class EJ_tabla_de_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int n;
        
        System.out.print("Dime un numero ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        EJ_tabla_de_multiplicar.mostrar_tabla(n);
    }
    public static void mostrar_tabla(int n){
        
        for(int cont=1;cont<=10;cont++){
            System.out.println(n+" x "+cont+ " = " +n*cont);
        }
    }
}

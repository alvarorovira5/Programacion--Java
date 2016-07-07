/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

import java.util.Scanner;

/**
 *
 * @author Alumno_3
 */
public class EJ23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int A,B;
        
        System.out.print("Dime un numero: ");
        cad=teclado.nextLine();
        A=Integer.parseInt(cad);
        
        System.out.print("Dime un numero: ");
        cad=teclado.nextLine();
        B=Integer.parseInt(cad);
        
        int sumaDivisoresA=Calculo.sumaDivisores(A);
        int sumaDivisoresB=Calculo.sumaDivisores(B);
        
        if (sumaDivisoresA-A==B && sumaDivisoresB-B==A){
            System.out.println(A+ "y "+B+"son amigos.");
        }
        else{
            System.out.println("No son amigos");
        }
    }
}

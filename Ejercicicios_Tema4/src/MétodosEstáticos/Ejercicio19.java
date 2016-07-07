/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int x1,x2,y1,y2;
        System.out.println("Dime las coordenadas del punto A: ");
        cad=teclado.nextLine();
        x1=Integer.parseInt(cad);
        cad=teclado.nextLine();
        y1=Integer.parseInt(cad);
        System.out.println("Dime las coordenadas del punto B: ");
        cad=teclado.nextLine();
        x2=Integer.parseInt(cad);
        cad=teclado.nextLine();
        y2=Integer.parseInt(cad);
        System.out.println("La distancia es: "+distanciaEuclidea(x1,x2,y1,y1));
    }
    public static double distanciaEuclidea(int x1,int y1, int x2, int y2){
        int A=(x2-x1)*(x2-x1);
        int B=(y2-y1)*(y2-y1);
        int C= A+B;
        double D=Math.sqrt(C);
        return D;
    }
}

/*
 * Tabla de multiplicar
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Tabla_de_Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int n;
        System.out.println("Dime un nº ");
        cad=teclado.nextLine();
        n=Integer.parseInt(cad);
        
        System.out.println("Tabla de multiplica de n es "+n);
        for(int cont=1;cont<11;cont++){
            int resultado=n*cont;
            System.out.println(n+ " x "+cont+ " = " +resultado);
        }
    }
}

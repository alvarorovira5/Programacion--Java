/*
 * Introducir la nota de un alumno (número entero) e indicar la nota correspondiente
INS, SF; B; NT, SB o si es nota inválida. (Hacedlo con if y con switch)
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio17Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int numero;
        
        System.out.println("Dime un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        switch(numero){
            case 1: System.out.println("INS");
            case 2: System.out.println("INS");
            case 3: System.out.println("INS");
            case 4: System.out.println("INS"); break;
            case 5: System.out.println("Suf"); break;
            case 6: System.out.println("B"); break;
            case 7: System.out.println("NT"); break;
            case 8: System.out.println("NT"); break;
            case 9: System.out.println("SOB"); break;
            case 10: System.out.println("SOB"); break;
        }
        
    }
}

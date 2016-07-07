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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        Double nota;
        
        System.out.println("Dime la nota: ");
        cad=teclado.nextLine();
        nota=Double.parseDouble(cad);
        
        if (nota>=0 && nota<=4){
            System.out.println("INS");
        }
        else{
            if(nota==5){
                System.out.println("SF");
            }
            else{
                if(nota==6){
                    System.out.println("B");
                }
                else{
                    if(nota>=7 && nota<=8){
                        System.out.println("NT");
                    }
                    else{
                        System.out.println("SB");
                    }
                }
            }
        }
    }
}

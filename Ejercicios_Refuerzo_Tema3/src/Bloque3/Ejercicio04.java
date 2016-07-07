/*
 * Mostrar por pantalla los números comprendidos entre a y b, en orden
   descendente (do-while).
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int a,b,mayor,menor;
        
        System.out.println("Dime el valor de A");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        System.out.println("Dime el valor de B");
        cad=teclado.nextLine();
        b=Integer.parseInt(cad);
        
        if(a>b){
            mayor=a;
            mayor=b;
        }
        else{
            mayor=b;
            menor=a;
        }
        //Operador ternario:    mayor(a>b)?a:b; menor(b>a)?b:a;
    }
}
/*For
 * 
 * for(contador=mayor; contado>=menor;contador--){
 *  sout(contador);
 *  }
 */
/*
 * While
 * 
 * int contador;
 * contador=mayor
 * while(contador>=menor){
 *  
 *  sout(contador);
 * 
 *  contador--;
 * }
 * 
 * Do While
 * 
 * int contador;
 * contador=mayor;
 * do{
 *  
 *  sout(contador);
 *  contador--;
 * }while(contador>=menor);
 */
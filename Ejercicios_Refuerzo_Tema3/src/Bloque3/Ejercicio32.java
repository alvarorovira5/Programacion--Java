/*
 * Introduce una cantidad de dinero en euros menor que 100, indica la forma de
pagar es dinero con el menor número de billetes y monedas.
 */
package Bloque3;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int dinero;
        int resto1,resto2,resto5,resto10,resto20,resto50,billetes50,billetes20,billetes10,billetes5,monedas2,monedas1;

        System.out.print("Dime la cantidad: ");
        cad=teclado.nextLine();
        dinero=Integer.parseInt(cad);
        
        if(dinero<100){
        
        billetes50=(dinero/50);
        System.out.println(billetes50+" billetes de 50");
        resto50=(dinero%50);  
        
        billetes20=resto50/20;
        System.out.println(billetes20+" billetes de 20");
        resto20=resto50%20;
        
        billetes10=resto20/10;
        System.out.println(billetes10+" billetes de 10");
        resto10=resto20%10;
        
        billetes5=resto10/5;
        System.out.println(billetes5+" billetes de 5");
        resto5=resto10%5;
        
        monedas2=resto5/2;
        System.out.println(monedas2+" monedas de 2");
        resto2=resto5%2;
        
        monedas1=resto2/1;
        System.out.println(monedas1+" monedas de 1");
        resto1=resto2%1;
       
        }
    }
}

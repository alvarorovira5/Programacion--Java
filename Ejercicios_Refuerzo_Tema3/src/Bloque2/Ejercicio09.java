/*
 * Calcula las soluciones o solución de una ecuación de segundo grado, del tipo:
ax2+bx+c=0, donde a, b y c son números enteros introducidos por teclado.
Las soluciones son: D=b2-4*a*c,
Si D<0 no hay solución real.
Si D=0, tenemos x1 y x2 =-b/(2*a) //soluciones iguales
Si D>0 entonces x1=(-b+Math.sqrt(Math.pow(b)-4*a*c)/(2*a)
y x2=(-b-Math.sqrt(Math.pow(b)-4*a*c)/(2*a)
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
/*public class EcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int a,b,c;
        double d;
        
        System.out.println("Introduce un valor para a:");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        System.out.println("Introduce un valor para b:");
        cad=teclado.nextLine();
        b=Integer.parseInt(cad);
        
        System.out.println("Introduce un valor para c:");
        cad=teclado.nextLine();
        c=Integer.parseInt(cad);
        
        d=b*b-4*a*c;
        
        if(d<0){
            System.out.println("No hay solución");
        }
        else{
            if(d==0){
                //x2 =-b/(2*a)
            }
            else{
                if(){
                    
                }
            }
        }
              
        
    }
}
*/
/*
 * Realizar un programa tal que, pida el día, mes y año y nos indique si la fecha es correcta o incorrecta.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int d,m,a;
        int diaMes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean fechaBuena;
        
        
        System.out.print("Dime el dia ");
        cad=teclado.nextLine();
        d=Integer.parseInt(cad);
        
        System.out.print("Dime el mes ");
        cad=teclado.nextLine();
        m=Integer.parseInt(cad);
        
        System.out.print("Dime el año ");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        if((m<1 || m>12) || (a<1900 || a>2100)){
            fechaBuena=false;
        }
        else{
            boolean bisiesto;
            bisiesto=Fecha.comprobarbisiesto(a);
            if(bisiesto){
                diaMes[2]=29;
            }
            if(d>=1 && d<diaMes[m]){
                fechaBuena=true;
            }
            else{
                fechaBuena=false;
            }
           
        }
        if(fechaBuena){
            System.out.println("La fecha es correcta");
        }
        else{
            System.out.println("La fecha es incorrecta");
        }
    }
}

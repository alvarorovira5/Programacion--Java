/*
 * Realizar una clase que pida el día, mes y año, 
 * y nos diga cuántos días han transcurrido desde el 1 de Enero 
 * hasta esa fecha introducida.(Controlar también si el año es bisiesto, 
 * un año es bisiesto cuando el resto de dividirlo entre 400 es 0).
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int d,m,a;
        int diaMes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        System.out.print("Dime el dia ");
        cad=teclado.nextLine();
        d=Integer.parseInt(cad);
        
        System.out.print("Dime el mes ");
        cad=teclado.nextLine();
        m=Integer.parseInt(cad);
        
        System.out.print("Dime el año ");
        cad=teclado.nextLine();
        a=Integer.parseInt(cad);
        
        boolean bisiesto;
        bisiesto=Fecha.comprobarbisiesto(a);
        
       
        if(bisiesto=true){ diaMes[2]=29;}
        
        int diasTotales=0;
        for(int mes=1;mes<m;mes++){
            diasTotales=diasTotales+diaMes[mes];
        }
        diasTotales=diasTotales+d;
        System.out.println("Los dias que han transcurridos desde el 1 de Enero de 2013 hata: "+d+" del "+m+ " son "+diasTotales);
    }
}

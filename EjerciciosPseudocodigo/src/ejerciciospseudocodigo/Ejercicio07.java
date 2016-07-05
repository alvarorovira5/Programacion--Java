/*
 * Programa que lee la hora con formato hora, minutos y segundos e indica la
hora, minutos y segundos que será transcurrido un segundo.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int h,m,s;
        
        System.out.println("¿Dime la hora?");
        cad=teclado.nextLine();
        h=Integer.parseInt(cad);
        
        System.out.println("¿Dime el minuto?");
        cad=teclado.nextLine();
        m=Integer.parseInt(cad);
        
        System.out.println("¿Dime el segundo?");
        cad=teclado.nextLine();
        s=Integer.parseInt(cad);
        
        if((s>=0 && s<=59) && (m>=0 && m<=59) && (h>=0 && h<=23)){
            s=s+1;
            if(s==60){
                s=0;
                m=m+1;
                if(m==60){
                    m=0;
                    h=h+1;
                    if(h==24){
                        h=0;
                    }
                }          
            }
        }
        System.out.println("Son las "+h+" Horas: "+m+" minutos "+s+" segundos");
        
    }

    
}

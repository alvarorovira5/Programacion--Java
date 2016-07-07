/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Fecha {
    public static boolean comprobarbisiesto(int a){
        boolean b;
        if((a%4==0)&&(a%100!=0)|| a%400==0){
            b=true;
        }
        else{
            b=false;
        }
        return b;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Leer;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Leer {
    public static float numFloat(float numero){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Float.parseFloat(cad);
        
        return numero;
    }
    public static double numDouble(double numero){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Double.parseDouble(cad);
        
        return numero;
    }
    public static byte numByte(byte numero){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Byte.parseByte(cad);
        
        return numero;
    }
    public static short numShort(short numero){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Short.parseShort(cad);
        
        return numero;
    }
    public static long numLong(long numero){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer numero: ");
        cad=teclado.nextLine();
        numero=Long.parseLong(cad);
        
        return numero;
    }
    public static char Letra(char letra){
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        System.out.println("Leer letra: ");
        cad=teclado.nextLine();
        letra=cad.charAt(0);
        
        return letra;
    }
    
}

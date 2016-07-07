/*
 * Muestra una tabla de conversión de Kilómetros a Millas.
1. 1 Milla marina = 1852 metros
2. 1 Milla terrestre = 1609 metros
Introducir por teclado el número de Kilómetros, después un carácter: 'M' o 'T',
dependiendo si la conversión se hace a Millas terrestres o marinas. Mostrar el valor de la
conversión.
 */
package Bloque2;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int km;
        char letra;
        double MillaMarina,Millaterrestre;
        
        System.out.print("Dime cuantos km quieres convertir: ");
        cad=teclado.nextLine();
        km=Integer.parseInt(cad);
        
        System.out.print("Que conversion quieres hacer: ");
        cad=teclado.nextLine();
        letra=cad.charAt(0);
        
        if(letra=='M'){
            MillaMarina=km/1.852;
            System.out.println("La conversion de "+km+ "a millas marinas es de "+MillaMarina);
        }
        if(letra=='T'){
            Millaterrestre=km/1.609;
            System.out.println("La conversion de "+km+ "a millas terrestre es de "+Millaterrestre);
        }
        else{
            System.out.println("No hay conversión.");
        }
    }
}

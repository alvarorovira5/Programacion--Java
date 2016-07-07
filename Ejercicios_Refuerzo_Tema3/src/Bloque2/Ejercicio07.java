/*
 * Determinar la cantidad total a pagar por una llamada telefónica de acuerdo a las 
siguientes premisas:
a) Toda llamada que dure menos de 3 minutos tiene un coste de 0.25€/min.
b) Cada minuto asociado adicional a partir de los 3 minutos primeros cuesta 
0.06€.
Introducir por teclado el número de minutos utilizados. Llamar a la clase "telefono.java"
 */
package Bloque2;

import java.util.Scanner;


/**
 *
 * @author Alumno_3
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int minutos;
        double coste,menorque3;

        
        System.out.println("Dime los minutos que has hablado:");
        cad=teclado.nextLine();
        minutos=Integer.parseInt(cad);
        
        if (minutos<3){  
            coste=minutos*0.25;
        }
        else{
            minutos=minutos-2;
            coste=2*0.25+minutos*0.06;
        }
        
        System.out.println("El precio de los minutos totales es "+coste);
    }
}

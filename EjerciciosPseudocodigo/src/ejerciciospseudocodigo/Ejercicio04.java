/*
 * Cálculo de los salarios semanales de los empleados de una empresa, sabiendo que estos se calculan en base a las horas
 * semanales trabajadas y de acuerdo a un precio especificado por cada hora. Si se pasan de 40 horas semanales, las horas
 * extraordinarias se pagarán a razón de 1.5 veces la hora ordinaria.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad,nombre;
        int horas_trabajadas,horas_extra;
        float precio_hora,salario;
        
        System.out.println("Dime tu nombre:");
        cad=teclado.nextLine();
        nombre=cad;
        
        System.out.println("¿Cuanto vale la hora trabajada?");
        cad=teclado.nextLine();
        precio_hora=Float.parseFloat(cad);
        
        System.out.println("¿Cuantas horas has trabajado?");
        cad=teclado.nextLine();
        horas_trabajadas=Integer.parseInt(cad);     
        
        if(horas_trabajadas>40){
            horas_extra=horas_trabajadas-40;
            salario=(float) (horas_trabajadas*precio_hora+horas_extra*precio_hora*1.5);
            System.out.println("El trabaj@r "+nombre+" cobra "+salario);
        }
        else   {
            salario=horas_trabajadas*precio_hora;   
            System.out.println("El trabaj@r "+nombre+" cobra "+salario);
            }   
    }
}

/*
 * Diseña el algoritmo que deduzca el salario neto de un trabajador a partir de la lectura del nombre, horas trabajadas, precio de la hora, y sabiendo
 * aplicables son el 10% sobre el salario bruto.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad,nombre;
        int horas_trabajadas;
        float precio_hora,salario_bruto,salario_neto;
        
        System.out.println("Dime tu nombre");
        cad=teclado.nextLine();
        nombre=cad;
        
        System.out.println("¿Cuántas horas has trabajado?");
        cad=teclado.nextLine();
        horas_trabajadas=Integer.parseInt(cad);
        
        System.out.println("¿Cual es el precio de cada hora?");
        cad=teclado.nextLine();
        precio_hora=Float.parseFloat(cad);
        
        salario_bruto=horas_trabajadas*precio_hora;
        System.out.println("El salario bruto es "+salario_bruto);
        
        salario_neto=(float) (salario_bruto*0.9);
        System.out.println("El salario neto es "+salario_neto);       
    }
}

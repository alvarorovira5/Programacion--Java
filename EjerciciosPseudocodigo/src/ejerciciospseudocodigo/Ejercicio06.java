/*
 * Se desea calcular el salario neto de un trabajador en función del número de
horas trabajadas y la tasa de impuestos de acuerdo a las siguientes
hipótesis:
a. Las primeras 35 horas se pagan a tarifa normal.
b. Las horas que pasen de 35 se pagan a 1.5 veces la tarifa normal.
c. Las tasas de impuestos son:
c.i. Los primeros 100 euros son libres de impuestos.
c.ii. Los siguientes 100 euros tienen un 10% de impuestos.
c.iii. Los restantes un 25% de impuestos.
Mostrar así mismo el nombre, salario bruto, tasas y salario neto.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad,nombre;
        int horas_trabajadas;
        float precio_horas,salario_bruto,salario_neto,tasas;
        
        System.out.println("Dime tu nombre");
        cad=teclado.nextLine();
        nombre=cad;
        
        System.out.println("¿Cuántas horas has trabajado?");
        cad=teclado.nextLine();
        horas_trabajadas=Integer.parseInt(cad);
        
        System.out.println("¿Cuanto vale la hora trabajadas?");
        cad=teclado.nextLine();
        precio_horas=Float.parseFloat(cad);
        
        //Calculo del salario bruto
        if (horas_trabajadas>35){
            salario_bruto=(float) (35*precio_horas+(horas_trabajadas-35)*precio_horas*1.5);
            System.out.println("El salario de bruto de "+nombre+" es "+salario_bruto);
        }
        else{
            salario_bruto=horas_trabajadas*precio_horas;
            System.out.println("El salario de bruto de "+nombre+" es "+salario_bruto);
        }
        //Calculo del salario neto según el tipo de impuesto.
        if(salario_bruto<=100){
            tasas=0;
            salario_neto=salario_bruto-tasas;
        }
        else {
            if (salario_bruto<=200){
                tasas=(float) ((salario_bruto-100)*0.1);
                salario_neto=salario_bruto-tasas;    
                System.out.println("El salario de neto de "+nombre+" es "+salario_neto);
            }
            else{
                tasas=(float) (100*0.1 +(salario_bruto-200)*0.25);
                salario_neto=salario_bruto-tasas; 
                System.out.println("El salario de neto de "+nombre+" es "+salario_neto);
            }
        }
        
        
    }
}

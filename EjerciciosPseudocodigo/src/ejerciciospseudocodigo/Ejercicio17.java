/*
 * Introducir las notas de 15 alumnos, ¿cuántos aprobados hay, cuántos
suspensos? Especificar los porcentajes de aprobados y suspensos
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        float nota,n = 1,porcentajeSupensos,porcentajeAprobados;
        int aprobados=0,suspensos=0;
        
        for(int i=1;n<16;i++){
            System.out.print("Introduce tu nota: ");
            cad=teclado.nextLine();
            nota=Float.parseFloat(cad);
            n=n+1;
            if(nota>=5){
                aprobados=aprobados+1;
                //System.out.println("Hay aprobados "+aprobados);
            }
            else{
                suspensos=suspensos+1;
            }
        }
        System.out.println("Aprobados " +aprobados);
        System.out.println("Suspensos " +suspensos);
        porcentajeSupensos=suspensos*(100/15);
        System.out.println("El porcentaje de suspensos es "+porcentajeSupensos+" %");
        porcentajeAprobados=aprobados*(100/15);
        System.out.println("El porcentaje de aprobados es "+porcentajeAprobados+" %");
        
        
    }
}

/*
 * Se desea diseñar un algoritmo que escriba los nombres de los días de la
   semana en función del valor de una variable dia introducida por teclado.
 */
package ejerciciospseudocodigo;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        int dia;
        
        System.out.println("Dime el numero del dia:");
        cad=teclado.nextLine();
        dia=Integer.parseInt(cad);
        
        if (dia==1 ||dia==2 ||dia==3 ||dia==4 ||dia==5 ||dia==6 ||dia==7){
            switch (dia){
                case 1: System.out.println("El numero "+dia+" corresponde con el dia Lunes");
                    break;
                case 2: System.out.println("El numero "+dia+" corresponde con el dia Martes");
                    break;
                case 3: System.out.println("El numero "+dia+" corresponde con el dia Miercoles");
                    break;
                case 4: System.out.println("El numero "+dia+" corresponde con el dia Jueves");
                    break;
                case 5: System.out.println("El numero "+dia+" corresponde con el dia Viernes");
                    break;
                case 6: System.out.println("El numero "+dia+" corresponde con el dia Sabado");
                    break;
                case 7: System.out.println("El numero "+dia+" corresponde con el dia Domingo");
                    break;   
            }
        }
        else{
            System.out.println("El numero "+dia+" no es un día de la semana");
        }
        
    }
}

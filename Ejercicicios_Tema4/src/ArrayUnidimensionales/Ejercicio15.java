/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int primerTrimestre[]=new int[5];
        int segundoTrimestre[]=new int[5];
        int tercerTrimestre[]=new int[5];
        
        
        System.out.println("Leer notas del primer trimestre");
        for (int i = 0; i <primerTrimestre.length; i++) {
            System.out.println("Alumno "+i+" nota: ");
            cad=teclado.nextLine();
            primerTrimestre[i]=Integer.parseInt(cad);
        }
        System.out.println("Leer notas del segundo trimestre");
        for (int i = 0; i < segundoTrimestre.length; i++) {
            System.out.println("Alumno "+i+" nota: ");
            cad=teclado.nextLine();
            segundoTrimestre[i]=Integer.parseInt(cad);
        }
        System.out.println("Leer notas del tercer trimestre");
        for (int i = 0; i <tercerTrimestre.length; i++) {
            System.out.println("Alumno "+i+" nota: ");
            cad=teclado.nextLine();
            tercerTrimestre[i]=Integer.parseInt(cad);
        }
        
        int sumaPrimerTrimestre=0;
        int sumaSegundoTrimestre=0;
        int sumaTercerTrimestre=0;
        
        for (int i = 0; i < 5; i++) {
            sumaPrimerTrimestre=sumaPrimerTrimestre+primerTrimestre[i];
            sumaSegundoTrimestre=sumaSegundoTrimestre+segundoTrimestre[i];
            sumaTercerTrimestre=sumaTercerTrimestre+tercerTrimestre[i];
        }
        
        double mediaPrimerTrimestre=sumaPrimerTrimestre/5;
        double mediaSegundoTrimestre=sumaSegundoTrimestre/5;
        double mediaTercerTrimestre=sumaTercerTrimestre/5;
        System.out.println("Mostrar medias trimestres:");
        System.out.println("La media del primer trimestre es "+mediaPrimerTrimestre);
        System.out.println("La media del segundo trimestre es "+mediaSegundoTrimestre);
        System.out.println("La media del tercer trimestre es "+mediaTercerTrimestre);
        
        System.out.println("Introducir el alumno que nos interesa: ");
        int alumno;
        cad=teclado.nextLine();
        alumno=Integer.parseInt(cad);
        
        System.out.println("La media del alumno introducido es: ");
        double media_alumno;
        media_alumno=(double)((primerTrimestre[alumno]+segundoTrimestre[alumno]+tercerTrimestre[alumno])/3);
        System.out.print(media_alumno);
    }
}

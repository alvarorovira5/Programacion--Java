/*
 * Calcular el factorial de los 5 primeros números naturales
 */
package Bloque3;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for(int n=1;n<=8;n++){
            long fact=1;
            for(int cont=1;cont<=n;cont++){
                fact=fact*cont;
            }
            System.out.println("el valor del factorial de : "+n+" es "+fact);
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class Factorial_De_3_a_7 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        //Factorial de los 5 primeros numeros.
        for(int n=3;n<=7;n++){
        long factorial;
        factorial=EJ16_factorial_5primeros.calcularFactorial(n);
        System.out.println("El factorial de "+n+" es "+factorial);
    }
    }
    }


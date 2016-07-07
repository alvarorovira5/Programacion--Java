/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class EJ16_factorial_5primeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factorial de los 5 primeros numeros.
        for(int n=1;n<=5;n++){
        long factorial;
        factorial=EJ16_factorial_5primeros.calcularFactorial(n);
        System.out.println("El factorial de "+n+" es "+factorial);
    }
    }
           //Tipo de dato de salida      entrada
    public static long calcularFactorial(int n){
        long fact=1;
        for(int cont=1;cont<=n;cont++){
            fact=fact*cont;
        }
        return fact;
    }
}

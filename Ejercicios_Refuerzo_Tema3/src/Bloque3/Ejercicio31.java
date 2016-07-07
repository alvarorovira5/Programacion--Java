/*
 * Mostar el primer número primo a partir del 30.
 */
package Bloque3;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPrimos=0;
        for (int n =30;;n++){
        boolean primo=true;
            for (int cont=2;cont<=n/2;cont++){
                if(n%cont==0){
                    primo=false;
                    break;
                }
            }
            if(primo){
            System.out.println(n+" es primo.");
            break;
            }
    }
    }
}

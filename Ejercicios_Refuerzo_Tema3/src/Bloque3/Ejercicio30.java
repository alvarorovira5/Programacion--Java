/*
 * Mostrar los 10 primeros números primos.
 */
package Bloque3;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPrimos=0;
        for(int n=2; numPrimos<10;n++){
            int numDivisores=0;
            
            boolean primo=true;
            for (int cont=2;cont<=n/2;cont++){
                if(n%cont==0){
                    primo=false;
                    break;
                }
            }
            if(primo){
            System.out.println(n+" es primo.");
            numPrimos=numPrimos+1;
            }
        
        }
    }
}

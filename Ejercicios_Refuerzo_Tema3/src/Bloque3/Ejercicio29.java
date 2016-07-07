/*
 * Mostrar todos los números pirmos comprendidos entre 10 y 100.
 */
package Bloque3;

/**
 *
 * @author Alvaro
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numDivisores=0;
        for(int n=10;n<101 ;n++){
            boolean primo=true;
            for (int cont=2;cont<=n/2;cont++){
                if(n%cont==0){
                    primo=false;
                    break;
                }
            }
            if(primo){
            System.out.println(n+" es primo.");
            }
        }
        
    }  
    
}
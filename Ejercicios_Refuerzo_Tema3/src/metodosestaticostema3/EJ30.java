/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class EJ30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPrimos=0;
        for(int n=1; numPrimos<10;n++){
            
            
            boolean primo = false;
            primo=Calculo.comprobarPrimo(n);
            if(primo){
            System.out.println(n+" es primo.");
            numPrimos=numPrimos+1;
            }
        
        }
    }
}

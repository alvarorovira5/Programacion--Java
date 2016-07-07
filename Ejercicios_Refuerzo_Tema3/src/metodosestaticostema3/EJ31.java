/*
 * Mostar el primer número primo a partir del 30.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class EJ31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int n =30;;n++){
        boolean primo=Calculo.comprobarPrimo(n);
        if(primo==true){
            System.out.println(+n);
            break;
        }
      }
    }
}

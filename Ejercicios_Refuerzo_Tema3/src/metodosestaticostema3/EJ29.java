/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class EJ29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean primo;
        for(int n=10;n<=100;n++){
            primo=Calculo.comprobarPrimo(n);
            if (primo==true){
                System.out.println(n);
            }
        }
    }
}

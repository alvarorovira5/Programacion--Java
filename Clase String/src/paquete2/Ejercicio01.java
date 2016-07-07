/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 65; i <= 122; i++) {
            System.out.println("\t"+((char)i));
            if((char)i=='N'){
                System.out.println("\tÑ");
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class fill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]= new int[10];
        MetodosEstáticos.fill(v,7,9,-1);
        MetodosEstáticos.mostraVector(v);
    }
}

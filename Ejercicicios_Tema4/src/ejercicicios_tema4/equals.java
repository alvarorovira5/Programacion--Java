/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[]=new int[10];
        int w[]=new int[10];
        MetodosEstáticos.fill(v, 20);
        MetodosEstáticos.fill(w, 20);
        System.out.println("Elementos de v: ");
        MetodosEstáticos.mostraVector(v);
        System.out.println("");
        System.out.println("Elementos de w: ");
        MetodosEstáticos.mostraVector(w);
        System.out.println("");
        boolean eq=MetodosEstáticos.equals(v, w);
        if(eq){
            System.out.println("Son iguales.");
        }
        else{
            System.out.println("Son distintos.");
        }
    }
}

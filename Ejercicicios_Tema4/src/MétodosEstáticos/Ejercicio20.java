/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MétodosEstáticos;

/**
 *
 * @author Alvaro
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[]={1,3,4,7,9,12,36};
        
        System.out.println("El vector generado es "+generarVectorPar(v));
    }
    public static int[] generarVectorPar(int v[]){
        int vectorPar[]=new int[v.length];
        
        for (int i = 0; i <v.length; i++) {
            if(v[i]%2==0){
                vectorPar[i]=v[i];
            }
        }
        return vectorPar;
    }
}

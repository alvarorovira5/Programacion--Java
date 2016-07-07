/*
 * Ídem una versión que devuelva el máximo de un array de elementos enteros. El método estará sobrecargado.
 */
package MétodosEstáticos;

/**
 *
 * @author Alvaro
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v[]={12,55,36,222,0,8,100};
        
        int mayor=myElemArray(v);
        
        System.out.println("El mayor elemento del array es "+mayor);
    }
    public static int myElemArray(int v[]){
        int mayor=v[0];
        for (int i = 1; i <v.length; i++) {
            if(mayor<v[i]){
                mayor=v[i];
            }
        }
        return mayor;
    }
}

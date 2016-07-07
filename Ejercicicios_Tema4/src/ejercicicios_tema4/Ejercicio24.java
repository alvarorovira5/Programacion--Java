/*
 * Utilizando el vector anterior. Indica cuál es el elemento mayor y el menor de aquellos
que sean distintos de 0, a partir de la primera posición hasta llegar a ésta.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={7,56,89,23,58,9,99,23,0,22};
        int mayor=lista[0];
        
        for(int i=1; i<lista.length;i++){
            if(lista[i]!=0 && mayor<lista[i]){
                mayor=lista[i];
            }
            else{
                break;
            }
        }
        System.out.println("El mayor es "+mayor);
    }
}

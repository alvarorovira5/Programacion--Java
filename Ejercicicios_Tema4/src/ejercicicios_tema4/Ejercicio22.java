/*
 * Declarar un vector que posea 10 elementos de tipo entero. Los valores de éstos son :
    7 56 89 23 58 9 99 23 0 22
    Indicar cuántos elementos del vector a partir de la primera posición hay distintos de 0.
    Cuando llegue a 0, se detiene la cuenta. NOTA: Diseña el ejercicio utilizando: while,
    do-while y for.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={7,56,89,23,58,9,99,23,0,22};
        int contador=0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]!=0){
                contador=contador+1;
            }
            else{
                break;
            }
        }
        System.out.println("Hay "+contador+" valores antes del 0");
    }
}

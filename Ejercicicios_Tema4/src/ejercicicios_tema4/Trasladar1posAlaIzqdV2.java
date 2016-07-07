/*
 * Desarrollar un metodo estatico, tal que dado un vector de enteros un valor entero y otro entero indicando
 * su posición. El metodo debe devolver ese mismo array con el valor insertado en la posición indicada, el 
 * ultimo valor del array se pierde.
 * Probar el metodo en un ejercicio, la clase se llenará: Ej MetInsertar en main, introducir 10 nº enteros en un vector,
 * pedir por teclado un valor a insertar, en el array, pedir también en que posición se quiere guardar. Se deben desplazar
 * todos los elementos a partir de esa posición hacia la derecha(el último valor se pierde), mostrar el vector.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Trasladar1posAlaIzqdV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={17,4,25,9,13};
        int x=29,indice=2;
        MetodosEstáticos.desplazar1posicionDrchaValor(lista, x, indice);
        MetodosEstáticos.mostraVector(lista);
    }
}

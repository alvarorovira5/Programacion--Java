/*
 * Generar un vector de 20 elementos de tipo entero, donde el valor de cada elemento 
 * equivale a su correspondiente a su posición. Mostrar el vector resultante.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[];
        lista=new int[20];
        
        for(int i=0;i<lista.length;i++){
            lista[i]=i;
        }
        System.out.println("Mostra el vector generado: ");
        for(int i=0;i<lista.length;i++){
            System.out.println("v["+i+"] = "+lista[i]);
        }
    }
}

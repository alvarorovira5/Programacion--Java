/*
 * Utilizando el vector anterior. Calcula la media aritmética de todos los elementos del
vector que sean distintos de 0, a partir de la primera posición hasta llegar a éste.
NOTA: Diseña el ejercicio utilizando: while, do-while y for.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={7,56,89,23,58,9,99,23,0,22};
        int suma=0,posicion=0;
        float media;
        
        for (int i = 0; i <lista.length; i++) {
            if(lista[i]!=0){
                suma=suma+lista[i];
                posicion=i+1;
            }
            else{
                break;
            }
        }
        media=(float)suma/posicion;
        System.out.println("La media es "+media);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={7,56,89,23,58,9,99,23,44,22};
        int w[]=new int[lista.length]; //cuando hago new se reserva espacio en memoria y el vector esta inicialmente a ceros.
        int y[]=new int[lista.length];
        
        for (int i = 0; i <lista.length; i++) {
            if(i%2==0){
                w[i]=lista[i]+15;
            }
            else{
                w[i]=lista[i];
            }
            y[i]=lista[i]%3;
        }
        int z[]=new int[lista.length];
        z=MetodosEstáticos.generaVector18(lista);
        MetodosEstáticos.mostraVector(z);
        /*
        //Mostrar los elementos de w
        System.out.println("Elemento del primer vector ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+" ");
        }
        System.out.println("");
        //Mostrar los elmentos de Y
        for (int i = 0; i <lista.length; i++) {
            System.out.print(y[i]+" ");
        }*/
    }
}

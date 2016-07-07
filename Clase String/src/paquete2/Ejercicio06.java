/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String texto="Tomates verdes fritos";
       int v[]=new int[texto.length()];
       
       texto=texto.toUpperCase();
       int i=0;
       int inicio=texto.indexOf('T');
       while(inicio!= -1)
       {
           v[i++]=inicio;
           inicio++;
           inicio=texto.indexOf('T',inicio);
       }
        for (int j = 0; j <i; j++) {
            System.out.println(v[j]);
        }
    }
}

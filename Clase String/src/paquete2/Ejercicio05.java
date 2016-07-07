/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="oowao";
        int posi;
        posi=texto.toUpperCase().indexOf('W');
        if (posi==-1) {
            System.out.println("Elemento no encontrado.");
        }
        else{
            System.out.println("La w se encuentra en la posicion: "+posi+" del texto "+texto);
        }
    }
}

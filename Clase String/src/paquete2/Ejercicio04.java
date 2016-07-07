/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="Mañana es sabado sabadete y voy a irme a tomar unas copillas por los barrios bajos de Logroño";
        //texto=texto.toUpperCase();
        int cuantaAes=0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='a'|| texto.charAt(i)=='A'){
                cuantaAes=cuantaAes+1;
            }
        }
        System.out.println("Tiene "+cuantaAes+ " a.");
    }
}

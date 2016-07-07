/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="ABC12m4XYZ";
        int suma=0;
        
        for (int i = 0; i <texto.length(); i++) {
            if(Character.isDigit(texto.charAt(i))){
                suma=((int)suma+texto.charAt(i))-48;// le quitamos los caracteres ascii
            }
        }
        System.out.println("la suma es: "+suma);
    }
}

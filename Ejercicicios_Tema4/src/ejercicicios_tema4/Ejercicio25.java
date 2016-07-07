/*
 * Mostrar los elementos de una matriz de 3x3 que pertenecen a la diagonal principal y la inversa, cuyos valores son:
 * 7    14    24
 * 13    9    19
 * 32   22    25
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[][]={{7,14,24},{13,9,19},{32,22,25}};
        System.out.println("Elementos de la diagonal principal.");
        for (int i = 0; i <m.length; i++) {
            System.out.println(m[i][i]+" ");
        }
        System.out.println("Elementos de la diagonal inversa.");
        for (int i = 0 ,j=m.length-1; i <m.length && j>=0; i++,j--) {
            System.out.println(m[i][j]+"");
        }
        /*
         * otra forma:
         * for(int i=0; izm.length;i++){
         *      sout(m[i][(m.length-1)-1]);
         * }
         *          */
     
    }
}

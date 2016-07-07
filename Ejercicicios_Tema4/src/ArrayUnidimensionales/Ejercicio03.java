/*
 * Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.
 */
package ArrayUnidimensionales;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int lista[];
        lista=new int[5];
        int numeroPositivo=0,sumaPositivo=0,sumaNegativo=0,numeroNegativo=0,contadorCeros=0;
        double mediaPositivo,mediaNegativo;
        //Leer
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Para v["+i+"] = ");
            cad=teclado.nextLine();
            lista[i]=Integer.parseInt(cad);
        }
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]>0){
                sumaPositivo=sumaPositivo+lista[i];
                numeroPositivo=numeroPositivo+1;
            }
            else{
                if(lista[i]<0){
                    sumaNegativo=sumaNegativo+lista[i];
                    numeroNegativo=numeroNegativo+1;
                }
                else{
                    contadorCeros=contadorCeros+1;
                }
            }
        }
        mediaPositivo=(double)sumaPositivo/numeroPositivo;
        System.out.println("La media de los positivos es "+mediaPositivo);
        mediaNegativo=(double)sumaNegativo/numeroNegativo;
        System.out.println("La media de los negativos es "+mediaNegativo);
        System.out.println("Hay "+contadorCeros+" ceros.");
    }
}

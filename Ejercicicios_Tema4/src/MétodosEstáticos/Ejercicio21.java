/*
 * Diseñar un método estático: opera_array, a la que se le pasa dos arrays, el número de elementos útiles y que operación se desea realizar:
 * sumar, restar, multiplicar o dividir (mediante un carácter: 's', 'r', 'm', 'd'). El método estático debe devolver un array con los resultados. 
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        
        int A[]={15,20,36,59,7};
        int B[]={88,64,13,2,3};
        char operacion;
        int numElem=4;
        
        System.out.println("Lee la operacion a realizar: ");
        cad=teclado.nextLine();
        operacion=cad.charAt(0);
        
        System.out.println("El resultado de la operacion es: "+opera_array(A,B,numElem,operacion));
    }
    public static int[] opera_array(int A[],int B[],int numElem,char operacion){
        int resultado[]=new int[numElem];
        
        switch(operacion){
            case's': for (int i = 0; i <numElem; i++) {
                    resultado[i]=A[i]+B[i];
                    break;
                }
            case'r': for (int i = 0; i <numElem; i++) {
                    resultado[i]=A[i]+B[i];
                    break;
                }
            case'm': for (int i = 0; i <numElem; i++) {
                    resultado[i]=A[i]*B[i];
                    break;
                }
            case'd': for (int i = 0; i <numElem; i++) {
                    resultado[i]=A[i]*B[i];
                    break;
                } 
        }
        return resultado;  
    }
}

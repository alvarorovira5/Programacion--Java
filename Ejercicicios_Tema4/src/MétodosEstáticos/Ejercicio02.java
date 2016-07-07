/*
 * 2.Realizar un método estático: mostrarMensaje, al que se le pase como parámetro un número entero N, 
 * y muestre por pantalla N veces, el mensaje: “Método ejecutándose”. 
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        int numero;
        System.out.print("Leer numero:");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        
        mostrarMensaje(numero);
                
    }
    public static void mostrarMensaje(int numero){
        for (int i = 0; i <numero; i++) {
            System.out.println("Método ejecutándose.");
        }
    }
}

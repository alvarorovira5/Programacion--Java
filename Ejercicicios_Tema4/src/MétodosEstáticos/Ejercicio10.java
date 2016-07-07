/*
 * Ídem que devuelva en un array el área y la longitud. Método sobrecargado.
 */
package MétodosEstáticos;
import static MétodosEstáticos.Ejercicio09.longitudAreaCirculo;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cad;
        float radio;
        char letra;
        
        System.out.print("El radio es: ");
        cad=teclado.nextLine();
        radio=Float.parseFloat(cad);
        
        longitudAreaCirculo(radio);
        System.out.println("El resultado es: "+longitudAreaCirculo(radio));
    }
    public static double[] longitudAreaCirculo(float radio){
        double lista[]=new double[2];
        double area,longitud;
         area=3.1416*radio*radio;
         longitud=2*3.1416*radio;
        for (int i = 0; i < lista.length; i++) {
            lista[0]=area;
            lista[1]=longitud;
        }
            return lista;
    }
}

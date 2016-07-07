/*
 * Realizar un método estático: longitudAreaCirculo que devuelva el área de un círculo o la longitud de una circunferencia,
 * según se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'l' (para la longitud). 
 * Además hemos de pasarle al método estático el radio (valores enteros).
 * A= Π·R2    L= 2 · Π · R
 */
package MétodosEstáticos;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class Ejercicio09 {

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
        
        System.out.println("¿Que quieres hacer: pulsa 'a' si quieres calcular el area, pulsa 'l' si quieres calcular la longitud?");
        cad=teclado.nextLine();
        letra=cad.charAt(0);
        
        System.out.println("La respuesta es "+longitudAreaCirculo(radio,letra));
        
    }
    public static double longitudAreaCirculo(float radio,char letra){
        double area,longitud;
        if(letra=='a'){
            area=3.1416*radio*radio;
            return area;
        }
        else{
            if(letra=='l'){
            longitud=2*3.1416*radio;
            return longitud;
            }
            else{
                longitud=0;
                return longitud;
            }
        }
    }
}

/*
 * Mostrar los elementos de una matriz de 3x3 que pertenecen a la diagonal principal
 * y la inversa, cuyos valores son: 
 * (12,34,56 para la 1ª fila, 45,67,89,23,45 para la 2ª fila y 67,89 para la 3ª fila).
a. Se desea calcular la suma total de todos los valores de los elementos de la matriz.
b. Se desea calcular la suma de cada una de las filas.
c. Se desea guardar un vector, la suma de cada una de las filas de la matriz. Mostrar posteriormente el valor de los elementos del vector.
d. Indicar cuál es el valor mayor de todos los elementos de la matriz, junto con la posición que ocupa.
e. Indicar si un número introducido por teclado se encuentra en la matriz
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cad;
        
        int m[][]={{12,34,56},{45,67,89,23,45},{67,89}};
        int suma=0;
        
        //Apartado A.
        for(int fila=0;fila<m.length;fila++){
            for (int columna = 0;  columna<m[fila].length; columna++) {
                suma=suma+m[fila][columna];
            }
        }
        System.out.println("La suma es "+suma);
        
        //Apartado B.
        for(int fila=0;fila<m.length;fila++){
            int sumaFila=0;
            for (int columna = 0;  columna<m[fila].length; columna++) {
                sumaFila=sumaFila+m[fila][columna];
            }
            System.out.println("La suma de la fila "+fila+" es "+sumaFila);
        }
        //Apartado C.
        int v[]=new int[m.length];
        
        for (int fila = 0; fila <m.length; fila++) {
            int Suma=0;
            for (int columna = 0; columna <m[fila].length; columna++) {
                Suma=Suma+m[fila][columna];
            }
            v[fila]=Suma;
        }
        //Mostrar vector resultante.
        System.out.println("Mostrar vector: ");
        for (int i = 0; i <v.length; i++) {
            System.out.println(v[i]);
        }
        //Apartado D
        int mayor=m[0][0];
        int filaMayor=0,columnaMayor=0;
        
        for (int fila = 0; fila <m.length; fila++) {
            for (int columna = 0; columna <m[fila].length; columna++) {
                if(m[fila][columna]>mayor){
                    mayor=m[fila][columna];
                    filaMayor=fila;
                    columnaMayor=columna;
                }
            }
        }
        System.out.println("El valor mayor es "+mayor+ " en la fila: "+filaMayor+" columna: "+columnaMayor+" ");
        
        //Apartado D
        int numero;
        System.out.println("Introduce un numero: ");
        cad=teclado.nextLine();
        numero=Integer.parseInt(cad);
        boolean encontrado=false;
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna <m[fila].length; columna++) {
                if(numero==m[fila][columna]){
                    encontrado=true;
                    break;
                }
                
            }
            if(encontrado){
                break;
            }
        }
        if(encontrado){
            System.out.println("Elemento encontrado.");
        }
        else{
            System.out.println("Elemento no encontrado. ");
        }
    }
}

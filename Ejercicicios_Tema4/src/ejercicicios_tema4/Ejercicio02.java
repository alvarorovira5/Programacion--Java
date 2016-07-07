/*
 * Declarar y crear un vector de 10 elementos de tipo entero. 
 * Generar un vector que almacene los valores de la tabla de multiplicar del 5.
 * Mostrar los valores del array.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla[]=new int[10];
        //Este for es para introducir en el array 
        for(int i=0;i<10;i++){
            tabla[i]=5*(i+1);
        }
        System.out.println("Tabla de multiplicar del 5");
        
        //Este for es para mostrar la tabla con los datos guardados en ella.
        /*for(int i=0;i<tabla.length;i++){
            System.out.println(tabla[i]);
        }*/
        //MOSTRAMOS EL VECTOR DESDE UN METODO mostrar vector de la clase MetodosEstáticos
            MetodosEstáticos.mostraVector(tabla);
    }
}
/*
 * Usando metodo estático.
 * 
 * int p=new int[10];
 * 
 * Vectores.mostrarVector(p);
 */
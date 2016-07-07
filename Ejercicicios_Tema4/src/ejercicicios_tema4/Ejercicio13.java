/*
 * Utilizando el vector anterior (ejercicio 10). 
 * Ordena el vector en orden ascendente con el método de la Burbuja (a base de intercambios).
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={12,4,5,78,45,67,45,66,77,44};
        int aux;
        int x[];
        x=MetodosEstáticos.ordenarVectorCreciente(lista);
        /*for (int i=0;i<lista.length;i++){
            for (int j = i; j<lista.length; j++) {
                if(lista[i]>lista[j]){//si invierto el sentido del menor al mayor me muestra el vector ordenador descendente
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }*/
        /*System.out.println("La vector ordenada es: ");
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }*/
        System.out.println("Mostrar el vector x ");
        MetodosEstáticos.mostraVector(x);
        System.out.println("Mostrar el vector p");
        MetodosEstáticos.mostraVector(lista);
    }
}

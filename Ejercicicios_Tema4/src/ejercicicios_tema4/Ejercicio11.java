/*
 * Utilizando el vector anterior (ejercicio 10). 
 * Calcular cuál es el mayor elemento e intercambiarlo 
 * por el elemento que ocupa la última posición.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={12,4,5,78,45,67,45,66,77,44};
        int mayor=lista[0];
        int i,posicion = 0;
        for(i=1;i<lista.length;i++){
            if(mayor<lista[i]){
                mayor=lista[i];
                posicion=i;
                
            }
        }
        System.out.println("El mayor es "+mayor+" en la posicion "+posicion);
        
        //Intercambio de valores, se podría hacer de otra manera, utilizando una variable auxiliar.
        lista[posicion]=lista[lista.length-1];
        lista[lista.length-1]=mayor;
        
        for (int j = 0; j < lista.length; j++) {
            System.out.println(lista[j]);
        }
        
    }
}

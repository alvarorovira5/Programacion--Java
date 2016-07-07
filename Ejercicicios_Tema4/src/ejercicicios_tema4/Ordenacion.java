/*
 * Ejercio mandado en clase el día 26/11/2013.
 * Ordenar una serie de numero, recorriendo la lista y cuando encuentre el mayor llevarlo a la ultima posición
 * Despues el segundo mayor hasta la penultimo y asi sucesivamente.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={18,20,9,7,4};
       
       
        //Escribir el array inicial
        System.out.print("El arrays es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+", ");
        }
       
        //Funcion
        
        for (int j = 0; j <lista.length; j++) {
            int mayor=lista[0],posicion=0;
        
        for (int i = 1; i < lista.length; i++) {
            if(mayor<lista[i]){
                mayor=lista[i];
                posicion=i;
             }
         }
         int aux=lista[lista.length-(j+1)];
         lista[lista.length-(j+1)]=mayor;
         lista[posicion]=aux;
        }
        //Escribir el arrays final
        System.out.println("La lista ordena es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]+"");
        }
    }
}
//El ejercicio solo es desplazar los elementos del array hacia la derecha.
/*
 * int lista[]={18,20,9,7,4};
 * int aux=lista[lista.lenght-1];
 * for(int i=lista.lenght-1;i>=1;i--){
 *  lista[i]=lista[i-1];
 * }
 * lista[0]=aux;
 * System.out.length("los elementos del vector son: ");
 * for(int i=0;i<lista.length;i++){
 *  System.out.println(lista[i]+" ,");
 * 
 */
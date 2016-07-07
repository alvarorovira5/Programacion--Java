/*
 * Utilizando el vector anterior (ejercicio 10). Llevar el mayor elemento al último a base de intercambios.
 * AUX = A;
   A = B;
   B = AUX;
 */
package ejercicicios_tema4;

public class Ejercicio12 {
    public static void main(String[] args) {
        int lista[]={12,4,5,78,45,67,45,66,77,44};
        int mayor=lista[0];
        int aux;
        System.out.print("La lista es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(+lista[i]+" ");
        }
        // Otra manera de hacer el intercambio
        /*
         * el "-1" del lista.lenght es para cuando el if hacemos las comprobaciones para v[i+1] no se
         * pase del tamaño del arrays.
         * 
         * for(int i=0;i<lista.length-1;i++){
         *  if(v[i]>v[i+1]){
         *      aux=v[i];
         *      v[i]=v[i+1];
         *      v[i+1]=aux;
         *  }
         * }
         */
        for (int i = 1; i < lista.length; i++) {
            if(mayor<lista[i]){
                mayor=lista[i];
            }
            else{
                aux=lista[i];
                lista[i]=lista[i-1];
                lista[i-1]=aux;
                
            }
            
        }
        System.out.println("");
        System.out.println("El mayor es "+mayor);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(+lista[i]+" ");
            
        }       
    }
}

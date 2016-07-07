/*
 * Declarar, crear e inicializar un vector de 17 elementos de tipo entero, los valores son: 7, 56,10,-23,0,9,-99,23,10,12,56,0,88,90,33,-2,28.
a. Contar las veces que se repite el valor 10 dentro del vector.
b. Contar cuántos elementos poseen valores nulos, positivos y negativos.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alvaro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[]={7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33,-2,28};
        int contador10=0; //Esta variable sirve para contar las ocurrencias de 10.
        int contadorPositivo=0;
        int contadoNegativo=0;
        int contadorNulo=0;
        //Recorro la lista de números.
        for(int i=0;i<lista.length;i++){
            if(lista[i]==10){//compruebo para cada valor si es 10, en tal caso aumento el contador.
                contador10=contador10+1;
            }
            if(lista[i]>0){
                contadorPositivo=contadorPositivo+1;
            }
            else {
                if(lista[i]<0){
                    contadoNegativo=contadoNegativo+1;
                }
                else{
                    contadorNulo=contadorNulo+1;
                }
            }
            
        }
        System.out.println("El número 10 se repite "+contador10);
        System.out.println("Existen "+contadorPositivo+" numeros positivos.");
        System.out.println("Existen "+contadoNegativo+" numeros negativos.");
        System.out.println("Existen "+contadorNulo+" numeros nulos.");
    }
}

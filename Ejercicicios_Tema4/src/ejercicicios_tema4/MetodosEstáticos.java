/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;
import java.util.Scanner;
/**
 *
 * @author Alumno_3
 */
public class MetodosEstáticos {
    
    public static int[] leerVector(int n){
       Scanner teclado= new Scanner(System.in);
       String cad;
       int lista[]=new int[n];
       for (int i = 0; i <n; i++) {
           System.out.print("Para la posicion v["+i+"] = ");
           cad=teclado.nextLine();
           lista[i]=Integer.parseInt(cad); 
       }
       
       return lista;
   }
    public static void mostraVector(int v[]){
        System.out.print("El vector es: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }
    }
    public static int[] generaVector18(int v[]){
        int w[]=new int[v.length]; 
        for (int i = 0; i < v.length; i++) {
            if(i%2==0){
                w[i]=v[i]+15;
            }
            else{
                w[i]=v[i];
            }
        }
        return w;
    }
    public static int[] ordenarVectorCreciente(int lista[]){
        int aux;
        for (int i=0;i<lista.length;i++){
            for (int j = i; j<lista.length; j++) {
                if(lista[i]>lista[j]){//si invierto el sentido del menor al mayor me muestra el vector ordenador descendente
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        return lista;
    }
    public static int sumaVector(int v[]){
        int suma=0;
        for (int i = 0; i <v.length; i++) {
            suma=suma+v[i];
        }
        return suma;
    }
    public static void traslada1posicionIzqd(int v[]){
        int aux=v[0];
        for (int i =0; i<v.length-1; i++) {
            v[i]=v[i+1];
        }
        v[v.length-1]=aux;
    }
    public static void desplazar1posicionDrchaValor(int v[],int x,int indice){
        for (int i =v.length-1; i>indice;i--) {
            v[i]=v[i-1];
        }
        v[indice]=x;
    }
    public static int[] prioridadPares(int v[]){
        int w[]=new int[v.length];
        int j=0;
        for (int i = 0; i <v.length; i++) {
            if(v[i]%2==0){
              w[j]=v[i];
              j++;
            }
        }
        for (int i = 0; i <v.length; i++) {
            if(v[i]%2!=0){
              w[j]=v[i];
              j++;
            }
        }
        return w;
    }
    public static int mayorVector(int v[]){
        //MayorVector tal que dado un vector, de enteros devuelve el valor mayor del vector
    }
    public static int menorVector(int v[]){
        //MenorVector tal que dado un vector, de enteros devuelve el valor menor del vector
    }
    public static int posicionValorVector(int v[], int x){
        //posicionValorVector, talque dado un vector de enteros devuelve la posición que ocupa un valor en el vector,
    //puede devolver *-1(si no esta) o un valor comprendido entre 0 uy la longitud vector -1.
        int indice=-1;
        for (int i = 0; i <v.length; i++) {
            if(v[i]==x){
                indice=i;
                break;
            }
            
        }
        return indice;
    }
    public static int repiteValorVector(int v[], int x){
// repiteValorVector, tal que dado un vector de enteros, al darle otro nº entero tambien, el metodo devuelve
//el  numero de veces que se repite ese numero en el vector.
    int vecesRepiteX=0;
    for(int i=0;i<v.length;i++){
        if(v[i]==x){
            vecesRepiteX=vecesRepiteX+1;
            }
    }
    return vecesRepiteX;
}
    public static int[] vectorIndicesVector(int v[], int x){
        //vectorIndicesVector, tal que dadndo un vector de enteros y un nº entero tb, devuelve en un array los índices 
    //ocupan ese nº en el vector.
        int w[]= new int[v.length];
        for (int i = 0; i <v.length; i++) {
            w[i]=-1;
        }
        int j=0;
        for (int i = 0; i <v.length; i++) {
            if(v[i]==x){
                w[j]=i;
                j++;
            }
            
        }
        return w;
    }
    public static void fill(int v[], int x){
        for (int i = 0; i <v.length; i++) {
            v[i]=x;
        }
    }
    public static void fill(int v[], int indComienzo, int indFinal,int x){
        for (int i=indComienzo; i<indFinal && i<v.length; i++) {
            v[i]=x;
        }
    }
    
    public static boolean equals(int v[],int w[]){
    //Diseña el método estático equals, tal que dado 2 arrays de tipo entero, nos devuelve true, si todos los elementos
    //del array coinciden en valor y orden que los del 2º array, o false, si existe al menos un elemento que no
    //coincide.
     boolean iguales;
     if(v.length!=w.length){
         iguales=false;
     }
     else{
         iguales =true;
         for (int i = 0; i <v.length; i++) {
             if (v[i]!=w[i]) {
                 iguales=false;
             }
         }
     }
     return iguales;
    }
    
}
    


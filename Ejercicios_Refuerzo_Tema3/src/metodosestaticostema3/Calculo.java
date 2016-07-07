/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticostema3;

/**
 *
 * @author Alumno_3
 */
public class Calculo {
    
    public static int contarDivisores(int n){
        int numDivisores=0;
        for(int cont=1; cont<=n/2;cont++){
            if(n%cont==0){
                numDivisores=numDivisores+1;
            }
        }
        return numDivisores;
    }
    
    public static void mostraDivisores(int n){
        int numDivisores=0;
        for(int cont=1; cont<=n;cont++){
            if(n%cont==0){
                System.out.println(cont+ " es divisor de "+n);
            }
        }
    }
    
    public static int sumaDivisores(int n){
        int sumaDivisores=0;
        for(int cont=1; cont<=n;cont++){
            if(n%cont==0){
                sumaDivisores=sumaDivisores+cont;
            }
        }
        return sumaDivisores;
    }
    public static boolean comprobarPrimo(int n){
        boolean primo=true;
        if(n==1){
            return primo=false;
            //System.out.println("1 No es primo");
        }
        
        int numDivisores=0;
        for(int cont=2;cont<=n;cont++){
            if(n%cont==0){
                primo=false;
                break;
               // numDivisores=numDivisores+1;
            }
        }
        return primo;
        /*
        if(numDivisores==2){
            System.out.println("El numero "+n+" primo");
        }
        else{
            System.out.println("El numero "+n+" no es primo.");
        }
        return false;*/
    }
}

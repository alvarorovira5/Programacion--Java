/*
 * Calcular la ecuación de tercer grado: x3 – 4x2 +x + 6 =0. Tiene tres soluciones
enteras en el intervalo [-10, 10]. Mostrar las soluciones por pantalla.
 */
package Bloque3;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado;
        for(int x=-10;x<=10;x++){
            resultado=(int)(Math.pow(x,3)-4*x*x+x+6);
            if(resultado==0){
                System.out.println("Solución "+x);
            }
        }
    }
}

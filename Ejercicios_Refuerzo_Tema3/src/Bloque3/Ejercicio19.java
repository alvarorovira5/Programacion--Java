/*
 * Tabla de multiplicar
 */
package Bloque3;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int n=3;n<8;n++){
            System.out.println("Tabla de multiplica de "+n);
            for(int cont=1;cont<11;cont++){
                int resultado=n*cont;
                System.out.println(n+ " x "+cont+ " = " +resultado);
            }
        }
    }
}

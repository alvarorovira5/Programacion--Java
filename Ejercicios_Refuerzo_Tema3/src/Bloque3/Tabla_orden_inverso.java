
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloque3;

/**
 *
 * @author Alumno_3
 */
public class Tabla_orden_inverso {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        for(int n=10;n>0;n--){
            System.out.println("Tabla de multiplica de "+n);
            for(int cont=1;cont<11;cont++){
                int resultado=n*cont;
                System.out.println(n+ " x "+cont+ " = " +resultado);
            }
        }
    }
}

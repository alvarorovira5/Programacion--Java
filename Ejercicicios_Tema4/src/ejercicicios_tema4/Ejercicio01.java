/*
 * Se desea crear un vector cuyo nombre sea diaDelMes, que almacena el número de días 
 * de los meses que componen un año, dándole un valor inicial a cada elemento del vector. 
 * Mostrar por pantalla los días de todos los meses desde Enero hasta Diciembre y además 
 * calcular la suma de los días de los 12 meses.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaDias=0;
        int diaMes[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String nombreMes[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
       
        for(int i = 0;i<12;i++){// Los arrays al empezar por 0, se pone que i<12, por los meses estan reflejados del mes 0 al 11.
            System.out.println(nombreMes[i]+" tiene "+diaMes[i]+" días.");
            sumaDias=sumaDias+diaMes[i];
        }
        System.out.println(" ");
        System.out.println("La suma de todos los días que tiene los meses es: "+sumaDias);
    }
}

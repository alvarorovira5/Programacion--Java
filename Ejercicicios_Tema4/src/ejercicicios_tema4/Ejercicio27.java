/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicios_tema4;

/**
 *
 * @author Alumno_3
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[][]={
{1,12,6,5,8,7,9,4,5,3,6,12,5,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{1,12,6,5,8,7,9,4,5,3,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{11,12,6,5,18,17,9,14,5,13,6,12,15,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{11,12,6,5,18,17,14,5,13,6,12,15,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{11,12,6,5,18,17,9,14,5,13,6,12,15,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30},
{25,26,26,24,25,26,24,25,27,28,29,30,31,32,30,31,32,31,32,31,32,31,32,32,32,32,32,32,32,32,32},
{25,26,26,24,25,26,24,25,27,28,29,30,31,32,30,31,32,31,32,31,32,31,32,32,32,32,32,32,32,32,32},
{21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30},
{11,12,6,5,18,17,9,14,5,13,6,12,15,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{11,12,6,5,18,17,14,5,13,6,12,15,4,9,10,11,15,2,6,8,12,11,13,12,14,10,11,10,21,10},
{1,12,6,5,8,7,9,4,5,3,6,12,5,4,9,1,1,1,2,6,8,1,1,1,2,4,10,1,1,1,1}};
        String mes[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
       //Apartado A)
        System.out.println("Mostrar la temperatura media de cada mes: ");
        for (int Mes = 0; Mes <m.length; Mes++) {
            int suma=0,media=0;
            for (int dia = 0; dia <m[Mes].length; dia++) {
                suma=suma+m[Mes][dia];
            }
            media=suma/m[Mes].length;
            System.out.println("La temperatura media de "+Mes+" es "+media+".");
        }
        //Apartado B)
        int mayor=m [0][0];
        for (int Mes = 0; Mes <m.length; Mes++) {
            for (int dia = 0; dia <m[Mes].length; dia++) {
                if(mayor<m[Mes][dia]) mayor=m[Mes][dia];
            }
        }
        System.out.println("El dia de mayor temperatura es "+mayor);
        
        int calor[]=new int[m.length];
        int frio[]=new int[m.length];
        for (int Mes = 0; Mes <m.length; Mes++) {
            int my=m[Mes][0],indMy=0;
            for (int dia = 0; dia <m[Mes].length; dia++) {
                if(m[Mes][dia]>my){
                    my=m[Mes][dia];
                    indMy=dia;
                }
            }
            calor[Mes]=indMy+1;
            
            int menor=[Mes][0];
            int indMenor=0;
            for (int dia = 0; dia <m[Mes].length; dia++) {
                if(m[Mes][dia]<menor){
                    menor=m[Mes][dia];
                    indMenor=dia;
                }
                
            }
            frio[mes]=indMenor+1;
        }
        System.out.println("El dia mas caluroso de cada mes es ");
        for (int i = 0; i < 10; i++) {
            
        }
        System.out.println("El día mas frío de cada mes es ");
        for (int i = 0; i < 10; i++) {
            
        }
        //Apartado C
        
         int my=m[0][0],indMes=0,inDia=0;
         /*
         for (int mes = 0; mes < Mes.length; mes++) {
         *      for(int dia=0;dia<m[mes].length;dia++){
         *      
         *      mayor=m[mes][dia];
         *      indMes=mes;
         *      indDia=dia;
         *      }
         * sout("El día más caluroso del año es en el mes:" +meses[indMes]+"el día:" +(indDia+1)+" con" +my+"grados".
         * }
            */
        
        //Apartado D
         /*
          * int mes;
          * do{
          *     sout(Dime el numero del mes que deseas saber sus temperaturas:)
          *     leer(mes)
          * }while(mes<1 || mes >12)
          * sout("Las temperaturas del mes: "+meses[mes-1]+"son";);
          * mostrarVector(m[mes-1]);
          */
    }
    
}

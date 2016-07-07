/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Alumno_3
 */
public class MyClaseString {
    public static String invertir(String texto){
        char x[]=new char[texto.length()];
       for (int i = 0; i <texto.length(); i++) {
            x[i]=texto.charAt(texto.length()-(i+1));
        }
       
        String textoInvertido= new String(x);
        System.out.println("Texto: "+texto);
        System.out.println("Y el invertido : "+textoInvertido);
        
        return textoInvertido;
    }
    public static boolean comprobarPalabra(String texto){
        String abecedario="ABCDEFGHIJKLMNÑOPQRSTUVW";
        texto=texto.toUpperCase();
       
        boolean esPalabra=true;
        for (int i = 0; i <texto.length(); i++) {
            if(abecedario.indexOf(texto.charAt(i))==-1){
                esPalabra=false;
                break;
            }
        }
        return esPalabra;
    }
    public static String sinEspacios(String texto){
        String textoLimpio="";
        texto=texto.trim();
        int inicio=0; //inicio es el indicie de comienzo de extracción de una subcadena.
        int fin = texto.indexOf(' '); //Fin es el indice donde se va encontrar el espacio en blanco.
        while(fin!=-1){
            textoLimpio=textoLimpio + texto.substring(inicio, fin);
            inicio=fin+1;
            fin=texto.indexOf(' ',inicio);
        }
        textoLimpio=textoLimpio+texto.substring(inicio, texto.length());
        
        return textoLimpio;
    }
}


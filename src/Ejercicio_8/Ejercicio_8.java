//Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
//class Uno{
//private static int metodo() {
//int valor=0;
//try {
//valor = valor+1;
//valor = valor + Integer.parseInt (”42”);
//valor = valor +1;
//System.out.println(”Valor final del try:” + valor) ;
//} catch (NumberFormatException e) {
//Valor = valor + Integer.parseInt(”42”);
//System.out.println(“Valor final del catch:” + valor);
//} finally {
//valor = valor + 1;
//System.out.println(”Valor final del finally: ” + valor) ;
//}
//valor = valor +1;
//System.out.println(”Valor antes del return: ” + valor) ;
//return valor;
//}
//
//
//public static void main (String[] args) {
//try {
//System.out.println (metodo()) ;
//}catch(Exception e) {
//System.err.println(”Excepcion en metodo() ”) ;
//e.printStackTrace();
//}
//}
//}
//class Dos{
//private static int metodo() {
//int valor=0;
//try{
//valor = valor + 1;
//valor = valor + Integer.parseInt (”W”);
//valor = valor + 1;
//System.out.println(”Valor final del try: ” + valor) ;
//} catch ( NumberFormatException e ) {
//valor = valor + Integer.parseInt (”42”);
//System.out.println(”Valor final del catch: ” + valor) ;
//} finally {
//valor = valor + 1;
//System.out.println(”Valor final del finally: ” + valor) ;
//}
//valor = valor + 1;
//System.out.println(”Valor antes del return: ” + valor) ;
//return valor;
//}
//public static void main (String[] args) {
//try{
//System.out.println ( metodo ( ) ) ;
//} catch(Exception e) {
//System.err.println ( ” Excepcion en metodo ( ) ” ) ;
//e.printStackTrace();
//}
//}
//}
//
//
//class Tres{
//private static int metodo( ) {
//int valor=0;
//try{
//valor = valor + 1;
//valor = valor + Integer.parseInt (”W”);
//valor = valor + 1;
//System.out.println(”Valor final del try: ” + valor);
//} catch(NumberFormatException e) {
//valor = valor + Integer.parseInt (”W”);
//System.out.println(”Valor final del catch: ” + valor);
//} finally{
//valor = valor + 1;
//System.out.println(”Valor final del finally:” + valor);
//}
//valor = valor + 1;
//System.out.println(”Valor antes del return: ” + valor) ;
//return valor;
//}
//public static void main (String[] args) {
//try{
//System.out.println( metodo ( ) ) ;
//} catch(Exception e) {
//System.err.println(”Excepcion en metodo ( ) ” ) ;
//e.printStackTrace();
//}
//}
//}
package Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Uno u = new Uno();
        Dos d = new Dos();
        Tres t = new Tres();

        try {
            System.out.println("El metodo uno: ");
            System.out.println(u.metodoUno());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo(): " + e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println("El metodo dos: ");
            System.out.println(d.metodoDos());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo(): " + e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println("El metodo tres: ");
            System.out.println(t.metodoTres());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo (): " + e.getMessage());
            e.printStackTrace();
        }
    }
}

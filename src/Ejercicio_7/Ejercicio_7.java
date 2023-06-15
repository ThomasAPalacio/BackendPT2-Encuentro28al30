//Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class B {
//public void metodoB() {
//sentencia_b1
//try {
//sentencia_b2
//} catch (MioException e){
//sentencia_b3
//}
//finally
//sentencia_b4
//}
//}
package Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ClaseB b = new ClaseB();
//        b.metodoB();
    }
}

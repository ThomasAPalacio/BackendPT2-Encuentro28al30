//Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class A {
//public void metodoA() {
//sentencia_a1
//sentencia_a2
//try {
//sentencia_a3
//sentencia_a4
//} catch (MioException e){
//sentencia_a6
//}
//sentencia_a5
//}
//}
package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ClaseA a = new ClaseA();

        a.metodoA();
    }
}

//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.

//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones
package Ejercicio_3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3y4 {

    public static void main(String[] args) {
        DivisionNumero num = new DivisionNumero();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese el numero 1: ");
            String num1 = leer.next();
            System.out.println("Ingrese el numero 2: ");
            String num2 = leer.next();

            num.divison(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("El valor que ingreso no es valido");
        } catch (NumberFormatException e) {
            System.out.println("El valor que ingreso no puede ser cambiado a entero");
        }

    }
}

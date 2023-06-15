package Ejercicio_3y4;

import java.util.Scanner;

public class DivisionNumero {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void divison(String num1, String num2) {
        
        try {
            System.out.println("El resultado de la division es: " + (Integer.parseInt(num1) / Integer.parseInt(num2)));
        } catch (ArithmeticException e) {
            System.out.println("Un numero no puede ser dividido por 0");
        }
        
    }
}

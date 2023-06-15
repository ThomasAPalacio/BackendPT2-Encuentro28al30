package Ejercicio_8;

import java.util.Scanner;

public class Tres {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static int metodoTres() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return:  " + valor);
        return valor;
    }
}

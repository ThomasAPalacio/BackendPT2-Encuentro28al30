//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).
package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Array a1 = new Array();

        try {
            System.out.println("Rellene el Array");
            for (int i = 0; i < 6; i++) {
                int j = a1.MiArray[i];
                j = leer.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //EL GETMESSAGE TE MUESTRA UNA FORMA MAS DETALLADA DEL ERROR OCASIONADO
            System.out.println("El arreglo se lleno de mas: " + e.getMessage());
        }
    }
}

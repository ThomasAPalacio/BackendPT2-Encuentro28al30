//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.
package Ejercicio_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont = 0;

        Random rand = new Random();
        int num;

        num = rand.nextInt(500) + 1;
        System.out.println(num);
        System.out.println("Intente adivinar el numero del 1 al 500");

        try {
            int num2 = leer.nextInt();
            cont++;
            do {
                if (num2 < num) {
                    System.out.println("Mas alto");
                    num2 = leer.nextInt();
                    cont++;
                } else {
                    System.out.println("Mas bajo");
                    num2 = leer.nextInt();
                    cont++;
                }
            } while (num != num2);

            if (num2 == num) {
                System.out.println("ADIVINO EL NUMERO!!! \n El numero era: " + num + "\n Usted tuvo: " + cont + " de intentos");
            }
        } catch (Exception e) {
            System.out.println("ESO NO ES UN NUMERO!!");
            System.out.println("Tuvo: " + (cont+1) + " intentos");
        }
    }
}

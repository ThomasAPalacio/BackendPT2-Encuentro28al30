package Ejercicio_2;

import java.util.Scanner;

public class Array {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int[] MiArray;

    public Array() {
        MiArray = new int[5];
    }

    public Array(int[] MiArray) {
        this.MiArray = MiArray;
    }

}

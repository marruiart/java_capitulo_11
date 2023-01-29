
/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Marina Ruiz Artacho
 */

import java.util.ArrayList;
import java.io.*;

public class Ejercicio01 {

    private static boolean esPrimo(int num) {
        boolean esPrimo = true;
        for (int i = 2; esPrimo && (i <= num / 2);) {
            if (num % i == 0)
                esPrimo = false;
            i++;
        }
        return esPrimo;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            if (esPrimo(i))
                bw.write(i + " ");
        }
        bw.close();
    }
}
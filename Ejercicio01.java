
/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        int n = 0;
        for (int i = 1; i <= 500; i++) {
            if (esPrimo(i)) {
                bw.write(String.format("%-3d ", i));
                n++;
                if (n % 10 == 0)
                    bw.write("\n");
            }
        }
        bw.close();
    }
}

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import classes.Primos;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("El número de argumentos tiene que ser dos");
            return;
        }
        int min;
        int max;
        try {
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Debe pasar dos argumentos de tipo entero.");
            return;
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./text_results/primos.dat"));
            int primo = min;
            do {
                primo = Primos.siguientePrimo(primo);
                if (primo <= max) {
                    bw.write(String.format("%d\n", primo));
                }
            } while (primo <= max);
            if (bw != null)
                bw.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
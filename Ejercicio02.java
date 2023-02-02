
/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.IOException;
import classes.Primos;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        Primos primos = new Primos("primos.dat");
        primos.add(501);
        System.out.println(primos);
        primos.writeToFile();
    }
}

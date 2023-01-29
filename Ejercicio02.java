
/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.*;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
        String linea = br.readLine();
        String[] numeros = linea.split(" ");
        linea = "";
        for (String n : numeros)
            linea += (n + ", ");
        System.out.println(linea.substring(0, linea.length() - 2));
        br.close();
    }
}

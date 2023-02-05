import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author Marina Ruiz Artacho
 */

public class Ejercicio06 {
    public static void main(String[] args) throws IOException {
        int rep = 0;
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String linea = br.readLine();
        String[] split;
        while (linea != null) {
            split = linea.split("(\\W|^)sol(\\W|$)");
            rep += split.length - 1;
            linea = br.readLine();
        }
        br.close();
        System.out.printf("La palabra %s se ha repetido %d veces.", args[1], rep);
    }
}

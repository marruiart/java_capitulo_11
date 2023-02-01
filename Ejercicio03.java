
/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del
 * primer fichero, la segunda será del segundo fichero, la tercera será la
 * siguiente del primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se
 * deben pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("fichero1.dat"));
        BufferedReader br2 = new BufferedReader(new FileReader("fichero2.dat"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("mix.dat"));

        String linea1 = "";
        String linea2 = "";
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        while (linea1 != null || linea2 != null) {
            if (linea1 != null) {
                bw.write(linea1);
            }
            if (linea2 != null) {
                bw.write(linea2);
            }
            linea1 = br1.readLine();
            linea2 = br2.readLine();
        }
        br1.close();
        br2.close();
        bw.close();
    }
}

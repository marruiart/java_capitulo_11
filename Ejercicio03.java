
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

import java.io.*;

public class Ejercicio03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("fichero1.dat"));
        BufferedReader br2 = new BufferedReader(new FileReader("fichero2.dat"));
        String linea1 = "";
        String linea2 = "";
        while (linea1 != null || linea2 != null) {
            linea1 = br1.readLine();
            linea2 = br2.readLine();
            if (linea1 != null)
                System.out.println(linea1);
            if (linea2 != null)
                System.out.println(linea2);
        }
        br1.close();
        br2.close();
    }
}

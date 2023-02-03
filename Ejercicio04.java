
/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author Marina Ruiz Artacho
 */

import classes.FileOrderer;

public class Ejercicio04 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Número incorrecto de argumentos");
            return;
        }
        String orig = args[0];
        int i = orig.lastIndexOf(".");
        String dest = orig.substring(0, i).concat("_sort.txt");
        dest = dest.replace("files", "results");
        try {
            FileOrderer orderedFile = new FileOrderer(orig, dest);
            orderedFile.writeToFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java
 * pero sin los comentarios.
 * 
 * @author Marina Ruiz Artacho
 */

import java.io.FileNotFoundException;
import classes.CommentaryRemover;

public class Ejercicio05 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            CommentaryRemover remover = new CommentaryRemover(args[0]);
            remover.writeToFile(args[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class FileOrderer {
    private ArrayList<String> palabras = new ArrayList<>();
    private String orig;
    private String dest;

    public FileOrderer(String orig, String dest) throws Exception {
        this.init(orig, dest);
    }

    private void init(String o, String d) throws Exception {
        this.orig = o;
        this.dest = d;
        BufferedReader br;
        br = new BufferedReader(new FileReader(this.orig));
        String linea = br.readLine();
        while (linea != null) {
            palabras.add(linea);
            linea = br.readLine();
        }
        br.close();
        Collections.sort(this.palabras, (p1, p2) -> p1.compareTo(p2));
    }

    public void writeToFile() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.dest));
        for (String l : this.palabras) {
            bw.write(String.format("%s\n", l));
        }
        bw.close();
    }
}

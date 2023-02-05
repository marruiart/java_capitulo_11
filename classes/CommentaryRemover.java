package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CommentaryRemover {
    private String str = "";
    private String readFile;

    public CommentaryRemover(String readFile) throws IOException {
        this.readFile = readFile;
        init(this.readFile);
    }

    private void init(String readFile) throws IOException {
        this.readFile = readFile;
        BufferedReader br = new BufferedReader(new FileReader(readFile));
        boolean write = true;
        String linea = br.readLine();
        while (linea != null) {
            if (write && (linea.indexOf("//") == -1))
                this.str += linea + "\n";
            linea = br.readLine();
            if (linea != null && linea.indexOf("/*") != -1)
                write = false;
            else if (linea != null && linea.indexOf("*/") != -1) {
                write = true;
                linea = br.readLine();
            }
        }
        br.close();
    }

    public void writeToFile(String writeFile) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
        String orig = this.readFile.substring(this.readFile.lastIndexOf("/") + 1).replace(".java", "");
        String dest = writeFile.substring(writeFile.lastIndexOf("/") + 1).replace(".java", "");
        this.str = this.str.replace(orig, dest);
        this.str = this.str.replace("files", "results");
        bw.write(str);
        bw.close();
    }

    @Override
    public String toString() {
        return this.str;
    }
}

package classes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterConsole extends BufferedWriter{

    public BufferedWriterConsole(Writer out) {
        super(out);
    }
    
    @Override
    public void write(String text) throws IOException{
        try {
            super.write(text);
            System.out.print(text);
        } catch (Exception e) {
            throw e;
        }
        
    }
}

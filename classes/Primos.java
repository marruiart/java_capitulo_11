package classes;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class Primos {
    ArrayList<Integer> primos = new ArrayList<>();
    String archivo;

    public Primos(String archivo) {
        this.archivo = archivo;
        this.init();
    }

    private void init() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();
            while (linea != null) {
                int primo = Integer.parseInt(linea);
                primos.add(primo);
                linea = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPrimo(int primo) {
        this.primos.add(primo);
    }

    public void add(int primo) {
        this.primos.add(primo);
    }

    public void writeToFile() {
        try {
            File file = new File("primos.dat");
            if (file.exists())
                file.delete();
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo));
            for (int primo : primos) {
                bw.write(String.format("%d\n", primo));
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Devuelve el siguiente primo al número pasado por parámetros.
     * 
     * @param valor
     * @return valor entero conteniendo el siguiente primo al número pasado por
     *         parámetros.
     */
    public static int siguientePrimo(int valor) {
        int sig = ++valor;
        boolean esPrimo = true;
        for (int i = 2; esPrimo && (i <= sig / 2); i++) {
            if (sig % i == 0)
                esPrimo = false;
            sig++;
        }
        return sig;
    }

    @Override
    public String toString() {
        String str = "";
        for (int primo : primos) {
            str += String.format("%3d\n", primo);
        }
        return str;
    }
}

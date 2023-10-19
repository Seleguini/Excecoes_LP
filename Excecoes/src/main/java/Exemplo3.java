import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log3.txt"));
        try {
            // Código que pode lançar uma exceção
            //int[] array = new int[5];
            //int valor = array[10];
            String x = null;
            System.out.println(x.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Exceção: " + e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }
    }

}

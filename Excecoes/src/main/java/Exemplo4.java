import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log4.txt"));
        try {
            // Código que pode lançar uma exceção
            // ...
        } catch (Exception e) {
            System.err.println("Exceção: " + e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        } finally {
            // Código a ser executado sempre, mesmo se ocorrer uma exceção
            System.out.println("Bloco finally executado.");
        }
    }

}

import java.io.*;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log2.txt"));
        try {
            // Código que pode lançar uma exceção
            FileReader file = new FileReader("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        } catch(Exception e){
            System.err.println("Minha exceção pai: " + e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }
    }
}

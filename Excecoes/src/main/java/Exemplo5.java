import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) throws IOException{
        String numeroString = "A";  // String que não é um número válido
        //String numeroString = "1";  // String que é um número válido
        converteNumero(numeroString);
    }
    private static void converteNumero(String numeroString) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log5.txt"));
        try {
            int numeroInt = Integer.parseInt(numeroString);
            System.out.println("Número convertido: " + numeroInt);
        } catch (NumberFormatException e) {
            System.err.println("Erro de conversão: " + e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }
    }
}

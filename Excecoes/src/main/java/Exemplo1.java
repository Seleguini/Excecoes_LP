import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Exceções");
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log1.txt"));
            try {
                // Código que pode lançar uma exceção
                int resultado = 10 / 0;
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.err.println("Ocorreu uma exceção: " + e.getMessage());
                buffWrite.append(e.getMessage());
                buffWrite.close();
            }
    }


}

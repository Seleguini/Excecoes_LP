import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Log6.txt"));
        try {
            verificarValor();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            buffWrite.append(e.getMessage());
            buffWrite.close();
        }
    }

    private static void verificarValor() throws IllegalArgumentException{
        int valor = -10;
        if (valor < 0) {
            throw new IllegalArgumentException("ABCDEFG 900: O valor não pode ser negativo.");
        }
    }

}

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
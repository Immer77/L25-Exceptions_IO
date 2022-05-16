package opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// Opgave 4 Skriver ind i fil
public class Opgave4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(".\\L25_IO_Exceptions\\src\\opgave4\\indskrivheltal.txt");
        PrintWriter pw = new PrintWriter(file);

        try {
            int j = 1;
            while (j <= 100){
                pw.println(j);
                j+=2;
            }

        }catch (InputMismatchException IE){
            System.out.println("File Contains Strings");
        } finally {
            pw.close();
        }

    }
}

package opgave7;

import filer.FilUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// Opgave 11.4
public class Opgave7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File(".\\L25_IO_Exceptions\\src\\opgave7\\mary.txt");
        File file2 = new File(".\\L25_IO_Exceptions\\src\\opgave7\\maryRevised.txt");
        PrintWriter pw = new PrintWriter(file2);
        Scanner in = new Scanner(file1);
        try {
            int j = 1;
            while (in.hasNextLine()){
                String lines = "/*" + j +"*/ " + in.nextLine();
                pw.println(lines);
                j++;
            }

        }catch (InputMismatchException ie){
            // Do nothing
        }finally {
            in.close();
            pw.close();
        }

    }

}

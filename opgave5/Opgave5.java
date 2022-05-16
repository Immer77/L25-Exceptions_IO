package opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// Opgave 5 tager input fra brugeren og skriver ind indtil der bliver skrevet '-1'
public class Opgave5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(".\\L25_IO_Exceptions\\src\\opgave5\\keyboardInput.txt");

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(file);

        try {
            boolean finished = false;
            while (!finished){
                System.out.print("Enter Number: ");
                int number = in.nextInt();
                if(number == -1){
                    finished = true;
                }else{
                    out.println(number);
                }
            }
        }catch (InputMismatchException ie){
            System.out.println("Not a number");
        }finally {
            in.close();
            out.close();
        }

    }
}

package opgave2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(".\\L25_IO_Exceptions\\src\\opgave2_3\\heltal.txt");
        ArrayList<Integer> numbersInFiles = new ArrayList<>();
        // Opgave 2.1
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String output = scanner.next();
            System.out.println(output);
        }
        // Opgave 2.2
        try (scanner) {
            while (scanner.hasNext()) {
                int output = scanner.nextInt();
                System.out.println(output * 2);
            }

        } catch (InputMismatchException IE) {
            System.out.println("File Contains Strings");
        } finally {
            scanner.close();
        }

        // Opgave 3
        try {

            while (scanner.hasNext()){
                int output = scanner.nextInt();
                numbersInFiles.add(0,output);
            }

        }catch (InputMismatchException IE){
            System.out.println("File Contains Strings");
        } finally {
            System.out.println(numbersInFiles);
            scanner.close();
        }

    }
}

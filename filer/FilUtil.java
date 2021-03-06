package filer;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FilUtil {

    /**
     * Pre: der skal være et tal i filen
     * finder max tallet
     * @param filename
     * @return max værdien i en fil med heltal
     * @throws IOException
     */
    public static int max(String filename) throws IOException {
        Scanner in = new Scanner(new File(filename));
        int max = 0;
        try {
            while (in.hasNext()){
                int k = in.nextInt();
                if (k > max){
                    max = k;
                }
            }
        }catch (InputMismatchException ie){
//            System.out.println(ie.getMessage());
            throw new RuntimeException("Der er noget i filen der ikke er et tal", ie);
        }finally {
            in.close();
        }
        return max;
    }

    /**
     * Finder min tallet
     * @param filename
     * @return
     * @throws IOException
     */

    public static int min(String filename) throws IOException{
        Scanner in = new Scanner(new File(filename));
        int min = Integer.MAX_VALUE;
        try {
            while (in.hasNext()){
                int k = in.nextInt();
                if (k < min){
                    min = k;
                }
            }
        }catch (InputMismatchException ie){
            System.out.println(ie.getMessage());
        }finally {
            in.close();
        }
        return min;
    }

    /**
     * Pre: Der skal være mere end 1 tal
     * @param filename
     * @return
     * @throws IOException
     */
    public static double gennemsnit(String filename) throws IOException{
        Scanner in = new Scanner(new File(filename));
        double j = 0;
        int counter = 0;
        try {
            while (in.hasNext()){
                j += in.nextInt();
                counter++;
            }
        }catch (InputMismatchException ie){
            System.out.println(ie.getMessage());
        }finally {
            in.close();
        }
        return j / counter;
    }
}

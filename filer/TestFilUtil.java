package filer;

import java.io.File;
import java.io.IOException;

// Opgave 6 Tester metoderne
public class TestFilUtil {
    public static void main(String[] args) throws IOException {
        String file1 = ".\\L25_IO_Exceptions\\src\\filer\\filename.txt";
        String file2 = ".\\L25_IO_Exceptions\\src\\filer\\filenameBig.txt";

        System.out.println("Tal fra 10 tals filen");
        System.out.println(FilUtil.max(file1));
        System.out.println(FilUtil.min(file1));
        System.out.println(FilUtil.gennemsnit(file1));

        System.out.println("\nTal fra 2500 tals filen");
        System.out.println(FilUtil.max(file2));
        System.out.println(FilUtil.min(file2));
        System.out.println(FilUtil.gennemsnit(file2));
    }
}

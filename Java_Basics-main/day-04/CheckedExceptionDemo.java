import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String args[]) {
        try {
            processFile("F://abcd.txt");
        } catch (Exception e) {
            System.out.println("Error while reading the contents of the file");
        }
    }

    private static void processFile(String filename) throws FileNotFoundException, IOException {

        File file = new File(filename);
        FileReader reader = new FileReader(file);
        char c = (char) reader.read();
        System.out.println("Character :: " + c);
    }
}

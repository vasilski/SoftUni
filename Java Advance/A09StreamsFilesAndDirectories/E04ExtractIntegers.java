package A09StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class E04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(
        "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        Scanner scan = new Scanner(inputStream);

        FileWriter writer = new FileWriter("out.txt");

        while (scan.hasNext()) {

            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                writer.write(String.valueOf(number));
                writer.write(System.lineSeparator());
            }
            scan.next();
        }
        writer.flush();
        writer.close();

        inputStream.close();
    }
}

package A09StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class E01ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int singleByte = inputStream.read();

        while (singleByte > 0) {

            System.out.print(Integer.toBinaryString(singleByte) + " ");

            singleByte = inputStream.read();
        }

        inputStream.close();
    }
}

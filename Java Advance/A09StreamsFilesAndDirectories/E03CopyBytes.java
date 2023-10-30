package A09StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class E03CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        int singleByte = inputStream.read();


        while (singleByte >= 0) {
            if (singleByte == 10 || singleByte == 32) {
                writer.print((char) singleByte);
            } else {
                writer.print(singleByte);
            }
            singleByte = inputStream.read();
        }

        writer.close();

        inputStream.close();
    }
}

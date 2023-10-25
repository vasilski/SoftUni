package A09StreamsFilesAndDirectories;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class E02WriteToFile {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        int singleByte = inputStream.read();
        Set<Character> punctuations = new HashSet<>();
        punctuations.add(',');
        punctuations.add('.');
        punctuations.add('!');
        punctuations.add('?');

        while (singleByte >= 0) {

            char symbol = (char) singleByte;

            if (!punctuations.contains(symbol)) {
                writer.print(symbol);
            }

            singleByte = inputStream.read();
        }

        writer.close();

        inputStream.close();
    }
}
